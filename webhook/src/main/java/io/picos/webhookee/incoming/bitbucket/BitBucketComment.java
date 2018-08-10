package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketComment {

    public static class BitBucketParent {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class BitBucketInline {

        private String path;

        private String from;

        private String to;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }
    }

    private String id;

    private BitBucketParent parent;

    private BitBucketContent content;

    private BitBucketInline inline;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("updated_on")
    private String updatedOn;

    private BitBucketLink link;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BitBucketParent getParent() {
        return parent;
    }

    public void setParent(BitBucketParent parent) {
        this.parent = parent;
    }

    public BitBucketContent getContent() {
        return content;
    }

    public void setContent(BitBucketContent content) {
        this.content = content;
    }

    public BitBucketInline getInline() {
        return inline;
    }

    public void setInline(BitBucketInline inline) {
        this.inline = inline;
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

    public BitBucketLink getLink() {
        return link;
    }

    public void setLink(BitBucketLink link) {
        this.link = link;
    }
}
