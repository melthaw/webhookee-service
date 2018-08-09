package io.picos.webhookee.core;

/**
 * @auther dz
 */
public interface Request {

    Route getRoute();

    WebhookMessage getPayload();

}
