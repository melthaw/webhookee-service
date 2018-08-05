package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

import java.io.Serializable;

/**
 * @auther dz
 */
public class WebhookeeMessage implements Serializable {

    private Route route;

    private Payload payload;

    public WebhookeeMessage() {
    }

    public WebhookeeMessage(Route route, Payload payload) {
        this.route = route;
        this.payload = payload;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

}
