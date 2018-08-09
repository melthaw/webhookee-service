package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.picos.webhookee.core.WebhookMessage;
import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.message.MessageProducer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;

/**
 * @auther dz
 */
@Component
public class RabbitMessageProducer implements MessageProducer, InitializingBean {

    private static final Log logger = LogFactory.getLog(RabbitMessageProducer.class);

    private Map<String, RabbitSupport> supportMap = new HashMap<>();

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void produce(Route route, WebhookMessage webhookMessage) {
        Optional.of(supportMap.get(route.getType()))
                .ifPresent(support -> {
                               try {
                                   RabbitPayload rabbitPayload = support.getCreator()
                                                                        .apply(route,
                                                                               webhookMessage);

                                   Message amqpMessage = MessageBuilder.withBody(objectMapper.writeValueAsBytes(rabbitPayload))
                                                                       .andProperties(MessagePropertiesBuilder.newInstance()
                                                                                                              .setContentType(
                                                                                                                      MessageProperties.CONTENT_TYPE_JSON)
                                                                                                              .build())
                                                                       .build();

                                   rabbitTemplate.convertAndSend(support.getQueue(),
                                                                 amqpMessage);
                               } catch (JsonProcessingException e) {
                                   logger.error("Serialize message failed", e);
                               } catch (AmqpException e) {
                                   logger.error("Sending message failed", e);
                               }
                           }
                );
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        supportMap.put(DockerHubMessage.MESSAGE_TYPE
                , new RabbitSupport() {
                    @Override
                    public String getQueue() {
                        return Constants.WEBHOOKEE_DOCKERHUB_QUEUE;
                    }

                    @Override
                    public BiFunction<Route, WebhookMessage, RabbitPayload> getCreator() {
                        return (route, webhookMessage) -> new DockerHubPayload(route,
                                                                               (DockerHubMessage) webhookMessage);
                    }
                });
        supportMap.put(CodingMessage.MESSAGE_TYPE,
                       new RabbitSupport() {
                           @Override
                           public String getQueue() {
                               return Constants.WEBHOOKEE_CODING_QUEUE;
                           }

                           @Override
                           public BiFunction<Route, WebhookMessage, RabbitPayload> getCreator() {
                               return (route, webhookMessage) -> new CodingPayload(route,
                                                                                   (CodingMessage) webhookMessage);
                           }
                       });
        supportMap.put(BitBucketMessage.MESSAGE_TYPE,
                       new RabbitSupport() {
                           @Override
                           public String getQueue() {
                               return Constants.WEBHOOKEE_BITBUCKET_QUEUE;
                           }

                           @Override
                           public BiFunction<Route, WebhookMessage, RabbitPayload> getCreator() {
                               return (route, webhookMessage) -> new BitBucketPayload(route,
                                                                                      (BitBucketMessage) webhookMessage);
                           }
                       });
        supportMap.put(GitHubMessage.MESSAGE_TYPE,
                       new RabbitSupport() {
                           @Override
                           public String getQueue() {
                               return Constants.WEBHOOKEE_GITHUB_QUEUE;
                           }

                           @Override
                           public BiFunction<Route, WebhookMessage, RabbitPayload> getCreator() {
                               return (route, webhookMessage) -> new GitHubPayload(route,
                                                                                   (GitHubMessage) webhookMessage);
                           }
                       });
        supportMap.put(GitLabMessage.MESSAGE_TYPE,
                       new RabbitSupport() {
                           @Override
                           public String getQueue() {
                               return Constants.WEBHOOKEE_GITLAB_QUEUE;
                           }

                           @Override
                           public BiFunction<Route, WebhookMessage, RabbitPayload> getCreator() {
                               return (route, webhookMessage) -> new GitLabPayload(route,
                                                                                   (GitLabMessage) webhookMessage);
                           }
                       });

    }

}
