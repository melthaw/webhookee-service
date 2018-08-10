package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingCommit {

    private String sha;

    private String message;

    @JsonProperty("short_message")
    private String shortMessage;

    private CodingUser committer;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getShortMessage() {
        return shortMessage;
    }

    public void setShortMessage(String shortMessage) {
        this.shortMessage = shortMessage;
    }

    public CodingUser getCommitter() {
        return committer;
    }

    public void setCommitter(CodingUser committer) {
        this.committer = committer;
    }
}
