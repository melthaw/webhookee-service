package io.picos.webhookee.incoming.dockerhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DockerHubMessage {

    @JsonProperty("callback_url")
    private String callbackUrl;

    @JsonProperty("push_data")
    private DockerHubPushData pushData;

    private DockerHubRepository repository;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public DockerHubPushData getPushData() {
        return pushData;
    }

    public void setPushData(DockerHubPushData pushData) {
        this.pushData = pushData;
    }

    public DockerHubRepository getRepository() {
        return repository;
    }

    public void setRepository(DockerHubRepository repository) {
        this.repository = repository;
    }

}
