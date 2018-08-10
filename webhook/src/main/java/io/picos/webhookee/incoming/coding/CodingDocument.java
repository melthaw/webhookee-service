package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingDocument {

    private String name;

    @JsonProperty("web_url")
    private String webUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
