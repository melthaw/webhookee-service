package io.picos.webhookee.config.service;

import io.picos.webhookee.config.model.RouteEntity;
import io.picos.webhookee.core.Router;

/**
 * @auther dz
 */
public interface RouteEntityService extends Router {

    RouteEntity generate(String routeName, String incomingType, String outgoingType, String targetUrl);

}
