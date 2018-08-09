package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.core.Payload;
import io.picos.webhookee.core.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @auther dz
 */
public class WebhookMessageDispatchers {

    private final static List<WebhookMessageDispatcher> dispatchers = new ArrayList<>();

    static {
        dispatchers.add(new WebhookMessageDispatcher() {

            @Override
            public void accept(Route route, Payload payload) {

            }

            @Override
            public boolean matches(Route route, Payload payload) {
                return false;
            }

        });

    }

    public static Stream stream() {
        return dispatchers.stream();
    }

}
