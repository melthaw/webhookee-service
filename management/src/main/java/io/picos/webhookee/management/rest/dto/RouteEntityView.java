package io.picos.webhookee.management.rest.dto;

import io.picos.webhookee.config.model.RouteEntity;
import org.springframework.beans.BeanUtils;

/**
 * @auther dz
 */
public class RouteEntityView extends RouteEntity {

    public static RouteEntityView from(RouteEntity entity) {
        if (entity == null) {
            return null;
        }

        RouteEntityView result = new RouteEntityView();
        BeanUtils.copyProperties(entity, result);
        result.setWebhookUrl(String.format("/api/%s/%s", entity.getType(), entity.getId()));
        return result;
    }

    private String webhookUrl;

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }
}
