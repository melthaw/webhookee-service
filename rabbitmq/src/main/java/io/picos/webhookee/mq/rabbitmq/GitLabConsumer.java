package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.message.MessageConsumer;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @auther dz
 */
@Component
public class GitLabConsumer implements MessageConsumer<GitLabMessage> {

    private static final Log logger = LogFactory.getLog(GitLabConsumer.class);

    @Autowired
    private ObjectMapper objectMapper;

    private RestTemplate restTemplate;

    @Autowired
    public GitLabConsumer(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @RabbitListener(queues = Constants.WEBHOOKEE_GITLAB_QUEUE)
    public void process(Message message) {
        try {
            //deserialize
            GitLabPayload rabbitPayload = objectMapper.readValue(message.getBody(),
                                                                 GitLabPayload.class);
            Route route = rabbitPayload.getRoute();
            GitLabMessage gitLabMessage = rabbitPayload.getMessage();

            consume(route, gitLabMessage);
        } catch (RestClientException e) {
            logger.error("Process webhook request failed.\n Content:\n" + new String(message.getBody()), e);
        } catch (IOException e) {
            logger.error("Parse json content failed.\n Content:\n" + new String(message.getBody()), e);
        } catch (Throwable e) {
            logger.error("Process webhook request failed.\n Content:\n" + new String(message.getBody()), e);
        }
    }

    @Override
    public void consume(Route route, GitLabMessage message) {

        if (WorkTileMessage.MESSAGE_TYPE.equals(route.getTargetType())) {
            this.restTemplate.postForLocation(route.getTargetUrl(),
                                              WorkTileMessages.from(message));
        }
        else if (BearyChatMessage.MESSAGE_TYPE.equals(route.getTargetType())) {
            this.restTemplate.postForLocation(route.getTargetUrl(),
                                              BearyChatMessage.from(message));
        }

    }
}
