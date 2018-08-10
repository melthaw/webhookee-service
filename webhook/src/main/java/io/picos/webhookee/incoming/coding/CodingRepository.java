package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingRepository {

    private String id;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("https_url")
    private String httpsUrl;

    @JsonProperty("web_url")
    private String webUrl;

    @JsonProperty("ssh_url")
    private String sshUrl;

    @JsonProperty("git_url")
    private String gitUrl;

    @JsonProperty("project_id")
    private String projectId;

    private CodingUser owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CodingUser getOwner() {
        return owner;
    }

    public void setOwner(CodingUser owner) {
        this.owner = owner;
    }
}
