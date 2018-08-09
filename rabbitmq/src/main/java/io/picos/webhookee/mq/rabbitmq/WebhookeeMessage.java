package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.picos.webhookee.core.DefaultRoute;
import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

import java.io.Serializable;

/**
 * @auther dz
 */
public class WebhookeeMessage<T extends Payload> implements Serializable {

    @JsonDeserialize(as = DefaultRoute.class)
    private Route route;

    private T payload;

    public WebhookeeMessage() {
    }

    public WebhookeeMessage(Route route, T payload) {
        this.route = route;
        this.payload = payload;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

}
