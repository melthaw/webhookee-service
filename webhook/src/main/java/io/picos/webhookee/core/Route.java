package io.picos.webhookee.core;

/**
 * @auther dz
 */
public interface Route {

    String getId();

    String getType();

    String getName();

    String getTargetType();

    String getTargetUrl();

    boolean isEnabled();

    String getDescription();

}
