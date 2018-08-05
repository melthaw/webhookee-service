package io.picos.webhookee.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @auther dz
 */
@Configuration
@ComponentScan({"io.picos.webhookee.config.service"})
@EnableMongoRepositories({"io.picos.webhookee.config.repository"})
public class ConfigAutoConfiguration {
}
