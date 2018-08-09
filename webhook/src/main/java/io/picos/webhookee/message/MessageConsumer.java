package io.picos.webhookee.message;

import io.picos.webhookee.core.WebhookMessage;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageConsumer<T extends WebhookMessage> {

    /**
     * @param route
     * @param message
     */
    void consume(Route route, T message);

}
