package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketAuthor {

    private String raw;

    private String type;

    private BitBucketOwner user;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BitBucketOwner getUser() {
        return user;
    }

    public void setUser(BitBucketOwner user) {
        this.user = user;
    }
}
