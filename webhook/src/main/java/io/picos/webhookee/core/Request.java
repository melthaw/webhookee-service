package io.picos.webhookee.core;

/**
 * @auther dz
 */
public interface Request {

    String getSourceType();

    Payload getPayload();

}
