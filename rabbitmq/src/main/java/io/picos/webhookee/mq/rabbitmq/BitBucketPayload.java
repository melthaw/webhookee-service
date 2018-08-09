package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;

/**
 * @auther dz
 */
public class BitBucketPayload extends RabbitPayload {

    private BitBucketMessage message;

    public BitBucketPayload() {
    }

    public BitBucketPayload(Route route, BitBucketMessage message) {
        super(route);
        this.message = message;
    }

    public BitBucketMessage getMessage() {
        return message;
    }

    public void setMessage(BitBucketMessage message) {
        this.message = message;
    }

}
