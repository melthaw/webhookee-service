package io.picos.webhookee.incoming.aliyun;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AliyunRepositoryMessage {

    public static final String MESSAGE_TYPE = "aliyun_repository";

    @JsonProperty("push_data")
    private AliyunPushData pushData;

    private AliyunRepository repository;

    public AliyunPushData getPushData() {
        return pushData;
    }

    public void setPushData(AliyunPushData pushData) {
        this.pushData = pushData;
    }

    public AliyunRepository getRepository() {
        return repository;
    }

    public void setRepository(AliyunRepository repository) {
        this.repository = repository;
    }

}
