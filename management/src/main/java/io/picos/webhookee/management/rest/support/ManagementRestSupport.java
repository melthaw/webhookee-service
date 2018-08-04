package io.picos.webhookee.management.rest.support;

import io.picos.webhookee.management.rest.dto.RouteEntitySaveParam;
import io.picos.webhookee.management.rest.dto.RouteEntitySearchParam;
import io.picos.webhookee.management.rest.dto.RouteEntityView;
import org.springframework.data.domain.Page;

/**
 * @auther dz
 */
public interface ManagementRestSupport {

    Page<RouteEntityView> search(RouteEntitySearchParam searchParam);

    RouteEntityView getDetail(String id);

    RouteEntityView create(RouteEntitySaveParam saveParam);

    RouteEntityView update(String id, RouteEntitySaveParam saveParam);

    RouteEntityView enable(String id);

    RouteEntityView disable(String id);

    void delete(String id);

}
