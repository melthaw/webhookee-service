package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketRepository {

    private String uuid;

    private String type;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    private String scm;

    private String website;

    @JsonProperty("is_private")
    private boolean isPrivate;

    private BitBucketLink links;

    private BitBucketProject project;

    private BitBucketOwner owner;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScm() {
        return scm;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }

    public BitBucketProject getProject() {
        return project;
    }

    public void setProject(BitBucketProject project) {
        this.project = project;
    }

    public BitBucketOwner getOwner() {
        return owner;
    }

    public void setOwner(BitBucketOwner owner) {
        this.owner = owner;
    }
}
