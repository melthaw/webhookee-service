package io.picos.webhookee.incoming.bitbucket;

import java.util.List;

/**
 * @auther dz
 */
public class BitBucketPushTarget {

    private String type;

    private String hash;

    private BitBucketAuthor author;

    private String message;

    private String date;

    private List<BitBucketPushTarget> parents;

    private BitBucketLink links;

    private BitBucketSummary summary;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public BitBucketAuthor getAuthor() {
        return author;
    }

    public void setAuthor(BitBucketAuthor author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<BitBucketPushTarget> getParents() {
        return parents;
    }

    public void setParents(List<BitBucketPushTarget> parents) {
        this.parents = parents;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }

    public BitBucketSummary getSummary() {
        return summary;
    }

    public void setSummary(BitBucketSummary summary) {
        this.summary = summary;
    }
}
