package io.picos.webhookee.config.service;

import io.picos.webhookee.config.model.RouteEntity;
import io.picos.webhookee.config.request.RouteEntitySaveRequest;
import io.picos.webhookee.config.request.RouteEntitySearchRequest;
import io.picos.webhookee.core.Router;
import org.springframework.data.domain.Page;

/**
 * @auther dz
 */
public interface RouteEntityService extends Router {

    RouteEntity getRoute(String id);

    Page<RouteEntity> searchRoutes(RouteEntitySearchRequest searchRequest);

    RouteEntity createRoute(RouteEntitySaveRequest saveRequest);

    RouteEntity updateRoute(String id, RouteEntitySaveRequest saveRequest);

    RouteEntity disableRoute(String id);

    RouteEntity enableRoute(String id);

    RouteEntity deleteRoute(String id);

}
