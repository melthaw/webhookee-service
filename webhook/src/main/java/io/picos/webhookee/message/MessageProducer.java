package io.picos.webhookee.message;

import io.picos.webhookee.core.Payload;

/**
 * @auther dz
 */
public interface MessageProducer<T> {

    /**
     *
     * @param payload
     * @return the type of underlying MQ asked.
     */
    T produce(Payload payload);

}
