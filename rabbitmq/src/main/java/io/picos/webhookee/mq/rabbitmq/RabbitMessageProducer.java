package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.picos.webhookee.core.Payload;
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
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;

/**
 * @auther dz
 */
@Component
public class RabbitMessageProducer implements MessageProducer, InitializingBean {

    private static final Log logger = LogFactory.getLog(RabbitMessageProducer.class);


    private Map<String, String> messageQueueMap = new HashMap<>();

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void produce(Route route, Payload payload) {
        try {
            WebhookeeMessage webhookeeMessage = new WebhookeeMessage(route, payload);
            Message jsonMessage = MessageBuilder.withBody(objectMapper.writeValueAsBytes(webhookeeMessage))
                                                .andProperties(MessagePropertiesBuilder.newInstance()
                                                                                       .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                                                                                       .build()).build();


            Optional.of(messageQueueMap.get(route.getType()))
                    .ifPresent(queue -> this.rabbitTemplate.convertAndSend(queue, jsonMessage));
        } catch (IOException e) {
            logger.error("Serialize message failed", e);
        } catch (AmqpException e) {
            logger.error("Sending message failed", e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        messageQueueMap.put(DockerHubMessage.MESSAGE_TYPE, Constants.WEBHOOKEE_DOCKERHUB_QUEUE);
        messageQueueMap.put(CodingMessage.MESSAGE_TYPE, Constants.WEBHOOKEE_CODING_QUEUE);
        messageQueueMap.put(BitBucketMessage.MESSAGE_TYPE, Constants.WEBHOOKEE_BITBUCKET_QUEUE);
        messageQueueMap.put(GitHubMessage.MESSAGE_TYPE, Constants.WEBHOOKEE_GITHUB_QUEUE);
        messageQueueMap.put(GitLabMessage.MESSAGE_TYPE, Constants.WEBHOOKEE_GITLAB_QUEUE);

    }

}
