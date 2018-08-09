package io.picos.webhookee.message;

import io.picos.webhookee.core.WebhookMessage;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageProducer<T extends WebhookMessage> {

    /**
     * TODO return Future
     *
     * @param route
     * @param payload
     */
    void produce(Route route, T payload);

}
