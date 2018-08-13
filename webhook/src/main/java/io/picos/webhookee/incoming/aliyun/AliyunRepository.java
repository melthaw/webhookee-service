package io.picos.webhookee.incoming.aliyun;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class AliyunRepository {

    private String dateCreated;

    private String name;

    private String namespace;

    private String region;

    @JsonProperty("repo_authentication_type")
    private String repoAuthenticationType;

    @JsonProperty("repo_full_name")
    private String repoFullName;

    @JsonProperty("repo_origin_type")
    private String repoOriginType;

    @JsonProperty("repo_type")
    private String repoType;

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRepoAuthenticationType() {
        return repoAuthenticationType;
    }

    public void setRepoAuthenticationType(String repoAuthenticationType) {
        this.repoAuthenticationType = repoAuthenticationType;
    }

    public String getRepoFullName() {
        return repoFullName;
    }

    public void setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
    }

    public String getRepoOriginType() {
        return repoOriginType;
    }

    public void setRepoOriginType(String repoOriginType) {
        this.repoOriginType = repoOriginType;
    }

    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }
}
