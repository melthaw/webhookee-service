package io.picos.webhookee.incoming.aliyun;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class AliyunPushData {

    private String digest;

    @JsonProperty("pushed_at")
    private String pushedAt;

    private String tag;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
