package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketCommitStatus {

    private String name;

    private String description;

    private String state;

    private String key;

    private String url;

    private String type;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("updated_on")
    private String updatedOn;

    private BitBucketLink links;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }
}
