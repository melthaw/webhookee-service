package io.picos.webhookee.config.request;

/**
 * @auther dz
 */
public interface RouteEntitySearchRequest {

    int getStart();

    int getLimit();

    String getType();

    String getName();

}
