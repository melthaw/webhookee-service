package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingMergeRequest {

    @JsonProperty("target_branch")
    private String targetBranch;

    private String body;

    private String title;

    private String status;

    @JsonProperty("source_branch")
    private String sourceBranch;

    @JsonProperty("web_url")
    private String webUrl;

    private String action;

    private String number;

    @JsonProperty("merge_commit_sha")
    private String mergeCommitSha;

    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }
}
