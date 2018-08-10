package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketEventTypes {

    public static final String REPO_PUSH = "repo:push";

    public static final String REPO_FORK = "repo:fork";

    public static final String REPO_UPDATED = "repo:updated";

    public static final String REPO_TRANSFER = "repo:transfer";

    public static final String REPO_COMMIT_COMMENT_CREATED = "repo:commit_comment_created";

    public static final String REPO_COMMIT_STATUS_CREATED = "repo:commit_status_created";

    public static final String REPO_COMMIT_STATUS_UPDATED = "repo:commit_status_updated";

    public static final String ISSUE_CREATED = "issue:created";

    public static final String ISSUE_UPDATED = "issue:updated";

    public static final String ISSUE_COMMENT_CREATED = "issue:comment_created";

    public static final String PULLREQUEST_CREATED = "pullrequest:created";

    public static final String PULLREQUEST_UPDATED = "pullrequest:updated";

    public static final String PULLREQUEST_APPROVED = "pullrequest:approved";

    public static final String PULLREQUEST_UNAPPROVED = "pullrequest:unapproved";

    public static final String PULLREQUEST_FULFILLED = "pullrequest:fulfilled";

    public static final String PULLREQUEST_REJECTED = "pullrequest:rejected";

    public static final String PULLREQUEST_COMMENT_CREATED = "pullrequest:comment_created";

    public static final String PULLREQUEST_COMMENT_UPDATED = "pullrequest:comment_updated";

    public static final String PULLREQUEST_COMMENT_DELETED = "pullrequest:comment_deleted";

}
