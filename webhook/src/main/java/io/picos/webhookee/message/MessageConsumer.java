package io.picos.webhookee.message;

import io.picos.webhookee.core.Request;
import io.picos.webhookee.core.Route;

/**
 * @auther dz
 */
public interface MessageConsumer {

    /**
     * @param request
     * @param route
     */
    void consume(Request request, Route route);

}
