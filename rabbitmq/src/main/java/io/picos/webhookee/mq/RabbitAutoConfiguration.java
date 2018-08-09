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
    public Queue dockerhubQueue() {
        return new Queue(Constants.WEBHOOKEE_DOCKERHUB_QUEUE);
    }

    @Bean
    public Queue bitbucketQueue() {
        return new Queue(Constants.WEBHOOKEE_BITBUCKET_QUEUE);
    }

    @Bean
    public Queue codingQueue() {
        return new Queue(Constants.WEBHOOKEE_CODING_QUEUE);
    }

    @Bean
    public Queue githubQueue() {
        return new Queue(Constants.WEBHOOKEE_GITHUB_QUEUE);
    }

    @Bean
    public Queue gitlabQueue() {
        return new Queue(Constants.WEBHOOKEE_GITLAB_QUEUE);
    }

}
