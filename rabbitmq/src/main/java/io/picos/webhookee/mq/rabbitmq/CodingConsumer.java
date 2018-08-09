package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.message.MessageConsumer;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;
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
public class CodingConsumer implements MessageConsumer<CodingMessage> {

    private static final Log logger = LogFactory.getLog(CodingConsumer.class);

    @Autowired
    private ObjectMapper objectMapper;

    private RestTemplate restTemplate;

    @Autowired
    public CodingConsumer(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @RabbitListener(queues = Constants.WEBHOOKEE_CODING_QUEUE)
    public void process(Message message) {
        try {
            //deserialize
            WebhookeeMessage<CodingMessage> webhookeeMessage = objectMapper.readValue(message.getBody(),
                                                                                      WebhookeeMessage.class);
            Route route = webhookeeMessage.getRoute();
            CodingMessage payload = webhookeeMessage.getPayload();

            consume(route, payload);
        } catch (RestClientException e) {
            logger.error("Process webhook request failed.\n Content:\n" + new String(message.getBody()), e);
        } catch (IOException e) {
            logger.error("Parse json content failed.\n Content:\n" + new String(message.getBody()), e);
        }
    }

    @Override
    public void consume(Route route, CodingMessage payload) {
        if (WorkTileMessage.MESSAGE_TYPE.equals(route.getTargetType())) {
            this.restTemplate.postForLocation(route.getTargetUrl(),
                                              WorkTileMessage.from(payload));
        }
        else if (BearyChatMessage.MESSAGE_TYPE.equals(route.getTargetType())) {
            this.restTemplate.postForLocation(route.getTargetUrl(),
                                              BearyChatMessage.from(payload));
        }
    }
}
