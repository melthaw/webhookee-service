package io.picos.webhookee.mq.rabbitmq;


import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.coding.CodingMessage;

/**
 * @auther dz
 */
public class CodingPayload extends RabbitPayload {

    private CodingMessage message;

    public CodingPayload() {
    }

    public CodingPayload(Route route, CodingMessage message) {
        super(route);
        this.message = message;
    }

    public CodingMessage getMessage() {
        return message;
    }

    public void setMessage(CodingMessage message) {
        this.message = message;
    }

}
