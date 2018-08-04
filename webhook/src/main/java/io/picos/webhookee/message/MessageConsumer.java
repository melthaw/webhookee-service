package io.picos.webhookee.message;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageConsumer {

    /**
     * @param payload
     * @param route
     */
    void consume(Payload payload, Route route);

}
