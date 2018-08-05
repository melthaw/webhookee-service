package io.picos.webhookee.message;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageProducer<T extends Payload> {

    /**
     * TODO return Future
     *
     * @param route
     * @param payload
     */
    void produce(Route route, T payload);

}
