package io.picos.webhookee.config.service.impl;

import io.picos.webhookee.config.model.RouteEntity;
import io.picos.webhookee.config.repository.RouteEntityRepository;
import io.picos.webhookee.config.service.RouteEntityService;
import io.picos.webhookee.core.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther dz
 */
@Service
public class RouteEntityServiceImpl implements RouteEntityService {

    @Autowired
    private RouteEntityRepository routeEntityRepository;

    @Override
    public Route findRoute(String id) {
        return routeEntityRepository.findById(id);
    }

    @Override
    public RouteEntity generate(String routeName, String incomingType, String outgoingType, String targetUrl) {
        RouteEntity result = new RouteEntity();
        result.setName(routeName);
        result.setType(incomingType);
        result.setTargetType(outgoingType);
        result.setTargetUrl(targetUrl);
        return routeEntityRepository.save(result);
    }

}
