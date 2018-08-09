package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.core.Route;
import io.picos.webhookee.core.WebhookMessage;

import java.util.function.BiFunction;

/**
 * @auther dz
 */
public interface RabbitSupport {

    String getQueue();

    BiFunction<Route, WebhookMessage, RabbitPayload> getCreator();

}
