package io.picos.webhookee.management.rest.dto;

import io.picos.webhookee.config.request.RouteEntitySearchRequest;

/**
 * @auther dz
 */
public class RouteEntitySearchParam implements RouteEntitySearchRequest {

    private int start = 0;

    private int limit = 20;

    private String type;

    private String name;

    @Override
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
