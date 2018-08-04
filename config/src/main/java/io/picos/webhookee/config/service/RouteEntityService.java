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

    Page<RouteEntity> search(RouteEntitySearchRequest searchRequest);

    RouteEntity create(RouteEntitySaveRequest saveRequest);

    RouteEntity update(String id, RouteEntitySaveRequest saveRequest);

    RouteEntity disable(String id);

    RouteEntity enable(String id);

    RouteEntity delete(String id);

}
