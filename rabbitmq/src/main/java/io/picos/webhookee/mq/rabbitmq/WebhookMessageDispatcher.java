package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

import java.util.function.BiConsumer;

/**
 * @auther dz
 */
public interface WebhookMessageDispatcher extends BiConsumer<Route, Payload> {

    boolean matches(Route route, Payload payload);

}
