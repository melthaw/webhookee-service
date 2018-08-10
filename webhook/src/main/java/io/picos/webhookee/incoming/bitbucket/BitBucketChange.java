package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketChange {

    private BitBucketChangeItem name;

    private BitBucketChangeItem website;

    private BitBucketChangeItem language;

    private BitBucketChangeItem description;

    @JsonProperty("full_name")
    private BitBucketChangeItem fullname;

    private BitBucketChangeItem status;

    private BitBucketLink links;

    public BitBucketChangeItem getName() {
        return name;
    }

    public void setName(BitBucketChangeItem name) {
        this.name = name;
    }

    public BitBucketChangeItem getWebsite() {
        return website;
    }

    public void setWebsite(BitBucketChangeItem website) {
        this.website = website;
    }

    public BitBucketChangeItem getLanguage() {
        return language;
    }

    public void setLanguage(BitBucketChangeItem language) {
        this.language = language;
    }

    public BitBucketChangeItem getDescription() {
        return description;
    }

    public void setDescription(BitBucketChangeItem description) {
        this.description = description;
    }

    public BitBucketChangeItem getFullname() {
        return fullname;
    }

    public void setFullname(BitBucketChangeItem fullname) {
        this.fullname = fullname;
    }

    public BitBucketChangeItem getStatus() {
        return status;
    }

    public void setStatus(BitBucketChangeItem status) {
        this.status = status;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }
}
