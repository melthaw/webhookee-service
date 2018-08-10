package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketChangeItem {

    @JsonProperty("new")
    private String newValue;

    private String old;

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
