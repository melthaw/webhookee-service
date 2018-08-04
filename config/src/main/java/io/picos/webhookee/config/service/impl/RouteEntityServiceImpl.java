package io.picos.webhookee.config.service.impl;

import io.picos.webhookee.config.exception.RouteEntityNotFoundException;
import io.picos.webhookee.config.model.RouteEntity;
import io.picos.webhookee.config.repository.RouteEntityRepository;
import io.picos.webhookee.config.request.RouteEntitySaveRequest;
import io.picos.webhookee.config.request.RouteEntitySearchRequest;
import io.picos.webhookee.config.service.RouteEntityService;
import io.picos.webhookee.core.Route;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public RouteEntity getRoute(String id) {
        return routeEntityRepository.findById(id);
    }

    @Override
    public Page<RouteEntity> searchRoutes(RouteEntitySearchRequest searchRequest) {
        return routeEntityRepository.findAll(new PageRequest(searchRequest.getStart(), searchRequest.getLimit()));
    }

    @Override
    public RouteEntity createRoute(RouteEntitySaveRequest saveRequest) {
        RouteEntity routeEntity = new RouteEntity();
        BeanUtils.copyProperties(saveRequest, routeEntity);
        routeEntity.setEnabled(true);
        return routeEntityRepository.save(routeEntity);
    }

    @Override
    public RouteEntity updateRoute(String id, RouteEntitySaveRequest saveRequest) {
        RouteEntity routeEntity = routeEntityRepository.findById(id);
        if (routeEntity == null) {
            throw new RouteEntityNotFoundException(id);
        }

        BeanUtils.copyProperties(saveRequest, routeEntity, "id", "enabled");
        return routeEntityRepository.save(routeEntity);
    }

    @Override
    public RouteEntity disableRoute(String id) {
        RouteEntity routeEntity = routeEntityRepository.findById(id);
        if (routeEntity == null) {
            throw new RouteEntityNotFoundException(id);
        }
        routeEntity.setEnabled(false);
        return routeEntityRepository.save(routeEntity);
    }

    @Override
    public RouteEntity enableRoute(String id) {
        RouteEntity routeEntity = routeEntityRepository.findById(id);
        if (routeEntity == null) {
            throw new RouteEntityNotFoundException(id);
        }
        routeEntity.setEnabled(true);
        return routeEntityRepository.save(routeEntity);
    }

    @Override
    public RouteEntity deleteRoute(String id) {
        RouteEntity routeEntity = routeEntityRepository.findById(id);
        if (routeEntity == null) {
            throw new RouteEntityNotFoundException(id);
        }
        routeEntityRepository.delete(routeEntity);
        return routeEntity;
    }

}
