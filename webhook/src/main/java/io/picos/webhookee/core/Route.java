package io.picos.webhookee.core;

/**
 * @auther dz
 */
public interface Route {

    String getId();

    String getType();

    String getName();

    String getDescription();

    String getTargetType();

    String getTargetUrl();

}
