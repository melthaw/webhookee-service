package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.picos.webhookee.core.WebhookMessage;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitBucketMessage implements WebhookMessage {

    public static final String MESSAGE_TYPE = "bitbucket";

    private BitBucketHeader header;

    private BitBucketOwner actor;

    private BitBucketRepository repository;

    private BitBucketRepository fork;

    private BitBucketPush push;

    private BitBucketChange changes;

    @JsonProperty("previous_owner")
    private BitBucketOwner previousOwner;

    private BitBucketComment comment;

    private BitBucketCommit commit;

    @JsonProperty("commit_status")
    private BitBucketCommitStatus commitStatus;

    private BitBucketIssue issue;

    private BitBucketPullRequest pullrequest;

    private BitBucketApproval approval;

    public BitBucketHeader getHeader() {
        return header;
    }

    public void setHeader(BitBucketHeader header) {
        this.header = header;
    }

    public BitBucketOwner getActor() {
        return actor;
    }

    public void setActor(BitBucketOwner actor) {
        this.actor = actor;
    }

    public BitBucketRepository getRepository() {
        return repository;
    }

    public void setRepository(BitBucketRepository repository) {
        this.repository = repository;
    }

    public BitBucketRepository getFork() {
        return fork;
    }

    public void setFork(BitBucketRepository fork) {
        this.fork = fork;
    }

    public BitBucketPush getPush() {
        return push;
    }

    public void setPush(BitBucketPush push) {
        this.push = push;
    }

    public BitBucketChange getChanges() {
        return changes;
    }

    public void setChanges(BitBucketChange changes) {
        this.changes = changes;
    }

    public BitBucketOwner getPreviousOwner() {
        return previousOwner;
    }

    public void setPreviousOwner(BitBucketOwner previousOwner) {
        this.previousOwner = previousOwner;
    }

    public BitBucketComment getComment() {
        return comment;
    }

    public void setComment(BitBucketComment comment) {
        this.comment = comment;
    }

    public BitBucketCommit getCommit() {
        return commit;
    }

    public void setCommit(BitBucketCommit commit) {
        this.commit = commit;
    }

    public BitBucketCommitStatus getCommitStatus() {
        return commitStatus;
    }

    public void setCommitStatus(BitBucketCommitStatus commitStatus) {
        this.commitStatus = commitStatus;
    }

    public BitBucketIssue getIssue() {
        return issue;
    }

    public void setIssue(BitBucketIssue issue) {
        this.issue = issue;
    }

    public BitBucketPullRequest getPullrequest() {
        return pullrequest;
    }

    public void setPullrequest(BitBucketPullRequest pullrequest) {
        this.pullrequest = pullrequest;
    }

    public BitBucketApproval getApproval() {
        return approval;
    }

    public void setApproval(BitBucketApproval approval) {
        this.approval = approval;
    }
}


