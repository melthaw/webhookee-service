package io.picos.webhookee.mq.rabbitmq;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.picos.webhookee.core.DefaultRoute;
import io.picos.webhookee.core.Route;

import java.io.Serializable;

/**
 * @auther dz
 */
public class RabbitPayload implements Serializable {

    @JsonDeserialize(as = DefaultRoute.class)
    private Route route;

    public RabbitPayload() {
    }

    public RabbitPayload(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

}
