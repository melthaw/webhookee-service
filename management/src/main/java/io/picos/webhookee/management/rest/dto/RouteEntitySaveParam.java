package io.picos.webhookee.management.rest.dto;

import io.picos.webhookee.config.request.RouteEntitySaveRequest;

import javax.validation.constraints.NotNull;

/**
 * @auther dz
 */
public class RouteEntitySaveParam implements RouteEntitySaveRequest {

    @NotNull
    private String type;

    @NotNull
    private String name;

    @NotNull
    private String targetType;

    @NotNull
    private String targetUrl;

    private String description;

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

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Override
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
