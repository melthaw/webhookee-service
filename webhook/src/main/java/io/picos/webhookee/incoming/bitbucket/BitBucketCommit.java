package io.picos.webhookee.incoming.bitbucket;

import java.util.List;

/**
 * @auther dz
 */
public class BitBucketCommit {

    private String hash;

    private String type;

    private String message;

    private BitBucketOwner author;

    private BitBucketLink links;

    private BitBucketSummary summary;

    private List<BitBucketCommit> parents;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BitBucketOwner getAuthor() {
        return author;
    }

    public void setAuthor(BitBucketOwner author) {
        this.author = author;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }
}
