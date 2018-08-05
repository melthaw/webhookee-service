package io.picos.webhookee.message;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageConsumer<T extends Payload> {

    /**
     * @param route
     * @param payload
     */
    void consume(Route route, T payload);

}
