package io.picos.webhookee.message;

import io.picos.webhookee.core.Request;

/**
 * @auther dz
 */
public interface MessageProducer<T> {

    /**
     *
     * @param request
     * @return the type of underlying MQ asked.
     */
    T produce(Request request);

}
