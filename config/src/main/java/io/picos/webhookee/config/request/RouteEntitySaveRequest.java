package io.picos.webhookee.config.request;

/**
 * @auther dz
 */
public interface RouteEntitySaveRequest {

    String getType();

    String getName();

    String getDescription();

    String getTargetType();

    String getTargetUrl();

}
