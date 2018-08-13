package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @auther dz
 */
public class BitBucketPushChange {

    @JsonProperty("new")
    private BitBucketPushChangeItem newValue;

    private BitBucketPushChangeItem old;

    private BitBucketLink links;

    private Boolean created;

    private Boolean forced;

    private Boolean closed;

    private Boolean truncated;

    private List<BitBucketCommit> commits;

    public BitBucketPushChangeItem getNewValue() {
        return newValue;
    }

    public void setNewValue(BitBucketPushChangeItem newValue) {
        this.newValue = newValue;
    }

    public BitBucketPushChangeItem getOld() {
        return old;
    }

    public void setOld(BitBucketPushChangeItem old) {
        this.old = old;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public Boolean getForced() {
        return forced;
    }

    public void setForced(Boolean forced) {
        this.forced = forced;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public List<BitBucketCommit> getCommits() {
        return commits;
    }

    public void setCommits(List<BitBucketCommit> commits) {
        this.commits = commits;
    }
}
