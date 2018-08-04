package io.picos.webhookee.management.rest.support.impl;

import io.picos.webhookee.config.model.RouteEntity;
import io.picos.webhookee.config.service.RouteEntityService;
import io.picos.webhookee.management.rest.dto.RouteEntitySaveParam;
import io.picos.webhookee.management.rest.dto.RouteEntitySearchParam;
import io.picos.webhookee.management.rest.dto.RouteEntityView;
import io.picos.webhookee.management.rest.support.ManagementRestSupport;
import io.picos.webhookee.outgoing.slack.SlackMessage;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.outgoing.dingding.DingDingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.outgoing.teambition.TeamBitionMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @auther dz
 */
@Component
public class ManagementRestSupportImpl implements ManagementRestSupport {

    @Autowired
    private RouteEntityService routeEntityService;

    @Override
    public Page<RouteEntityView> search(RouteEntitySearchParam searchParam) {
        Page<RouteEntity> routeEntityPage = routeEntityService.searchRoutes(searchParam);
        return new PageImpl<>(routeEntityPage.getContent()
                                             .stream()
                                             .map(RouteEntityView::from)
                                             .collect(Collectors.toList()),
                              new PageRequest(searchParam.getStart(), searchParam.getLimit()),
                              routeEntityPage.getTotalElements());
    }

    @Override
    public RouteEntityView getDetail(String id) {
        return RouteEntityView.from(routeEntityService.getRoute(id));
    }

    @Override
    public RouteEntityView create(RouteEntitySaveParam saveParam) {
        return RouteEntityView.from(routeEntityService.createRoute(saveParam));
    }

    @Override
    public RouteEntityView update(String id, RouteEntitySaveParam saveParam) {
        return RouteEntityView.from(routeEntityService.createRoute(saveParam));
    }

    @Override
    public RouteEntityView enable(String id) {
        return RouteEntityView.from(routeEntityService.enableRoute(id));
    }

    @Override
    public RouteEntityView disable(String id) {
        return RouteEntityView.from(routeEntityService.disableRoute(id));
    }

    @Override
    public void delete(String id) {
        routeEntityService.deleteRoute(id);
    }

}
