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



}


