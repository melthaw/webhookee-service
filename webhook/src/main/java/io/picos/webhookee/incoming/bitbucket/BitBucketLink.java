package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketLink {

    private BitBucketLinkItem self;

    private BitBucketLinkItem html;

    private BitBucketLinkItem avatar;

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
