package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketIssue {

    private String id;

    private String component;

    private String title;

    private BitBucketContent content;

    private String priority;

    private String state;

    private String type;

    private String milestone;

    private String version;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("updated_on")
    private String updatedOn;

    private BitBucketLink links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BitBucketContent getContent() {
        return content;
    }

    public void setContent(BitBucketContent content) {
        this.content = content;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
