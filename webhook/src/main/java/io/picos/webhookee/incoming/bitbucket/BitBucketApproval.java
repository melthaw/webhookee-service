package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketApproval {

    private String date;

    private BitBucketOwner user;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BitBucketOwner getUser() {
        return user;
    }

    public void setUser(BitBucketOwner user) {
        this.user = user;
    }
}
