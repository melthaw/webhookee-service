package io.picos.webhookee.mq;

import io.picos.webhookee.mq.rabbitmq.Constants;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther dz
 */
@Configuration
@EnableRabbit
@ComponentScan("io.picos.webhookee.mq.rabbitmq")
public class RabbitAutoConfiguration {

    @Bean
    public Queue myQueue() {
        return new Queue(Constants.WEBHOOKEE_QUEUE);
    }

}
