package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingTopic {

    private String title;

    @JsonProperty("web_url")
    private String webUrl;

    private CodingUser author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public CodingUser getAuthor() {
        return author;
    }

    public void setAuthor(CodingUser author) {
        this.author = author;
    }
}
