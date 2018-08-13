package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketLink {

    private BitBucketLinkItem self;

    private BitBucketLinkItem html;

    private BitBucketLinkItem avatar;

    private BitBucketLinkItem patch;

    private BitBucketLinkItem diff;

    private BitBucketLinkItem approve;

    private BitBucketLinkItem statuses;

    private BitBucketLinkItem comments;

    public BitBucketLinkItem getSelf() {
        return self;
    }

    public void setSelf(BitBucketLinkItem self) {
        this.self = self;
    }

    public BitBucketLinkItem getHtml() {
        return html;
    }

    public void setHtml(BitBucketLinkItem html) {
        this.html = html;
    }

    public BitBucketLinkItem getAvatar() {
        return avatar;
    }

    public void setAvatar(BitBucketLinkItem avatar) {
        this.avatar = avatar;
    }

    public BitBucketLinkItem getPatch() {
        return patch;
    }

    public void setPatch(BitBucketLinkItem patch) {
        this.patch = patch;
    }

    public BitBucketLinkItem getDiff() {
        return diff;
    }

    public void setDiff(BitBucketLinkItem diff) {
        this.diff = diff;
    }

    public BitBucketLinkItem getApprove() {
        return approve;
    }

    public void setApprove(BitBucketLinkItem approve) {
        this.approve = approve;
    }

    public BitBucketLinkItem getStatuses() {
        return statuses;
    }

    public void setStatuses(BitBucketLinkItem statuses) {
        this.statuses = statuses;
    }

    public BitBucketLinkItem getComments() {
        return comments;
    }

    public void setComments(BitBucketLinkItem comments) {
        this.comments = comments;
    }

    public static class BitBucketLinkItem {

        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
}
