package io.picos.webhookee.incoming.dockerhub;

//"push_data": {
//        "images": [
//        "27d47432a69bca5f2700e4dff7de0388ed65f9d3fb1ec645e2bc24c223dc1cc3",
//        "51a9c7c1f8bb2fa19bcd09789a34e63f35abb80044bc10196e304f6634cc582c",
//        "..."
//        ],
//        "pushed_at": 1.417566161e+09,
//        "pusher": "trustedbuilder",
//        "tag": "latest"
// },

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DockerHubPushData {

    private String[] images;

    @JsonProperty("pushed_at")
    private long pushedAt;

    private String pusher;

    private String tag;

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public long getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(long pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getPusher() {
        return pusher;
    }

    public void setPusher(String pusher) {
        this.pusher = pusher;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
