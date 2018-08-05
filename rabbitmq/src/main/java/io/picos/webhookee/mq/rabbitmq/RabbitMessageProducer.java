package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;
import io.picos.webhookee.message.MessageProducer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @auther dz
 */
@Component
public class RabbitMessageProducer implements MessageProducer {

    private static final Log logger = LogFactory.getLog(RabbitMessageProducer.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    private volatile CountDownLatch latch = new CountDownLatch(2);

    @Override
    public void produce(Route route, Payload payload) {
        try {
            WebhookeeMessage webhookeeMessage = new WebhookeeMessage(route, payload);
            Message jsonMessage = MessageBuilder.withBody(objectMapper.writeValueAsBytes(webhookeeMessage))
                                                .andProperties(MessagePropertiesBuilder.newInstance()
                                                                                       .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                                                                                       .build()).build();

            this.rabbitTemplate.convertAndSend(Constants.WEBHOOKEE_QUEUE, jsonMessage);
        } catch (IOException e) {
            logger.error("Serialize message failed", e);
        } catch (AmqpException e) {
            logger.error("Sending message failed", e);
        }
    }

}
