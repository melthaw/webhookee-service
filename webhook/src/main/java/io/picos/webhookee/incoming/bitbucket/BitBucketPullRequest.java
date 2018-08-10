package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @auther dz
 */
public class BitBucketPullRequest {


    private String id;

    private String title;

    private String description;

    private String state;

    private BitBucketOwner user;

    private BitBucketSource source;

    private BitBucketSource destination;

    @JsonProperty("merge_commit")
    private BitBucketCommit mergeCommit;

    private List<BitBucketOwner>  participants;

    private List<BitBucketOwner>  reviewers;

    @JsonProperty("close_source_branch")
    private Boolean closeSourceBranch;

    @JsonProperty("closed_by")
    private BitBucketOwner closedBy;

    private String reason;

    @JsonProperty("created_on")
    private String createdOn;

    @JsonProperty("updated_on")
    private String updatedOn;

    private BitBucketLink links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BitBucketOwner getUser() {
        return user;
    }

    public void setUser(BitBucketOwner user) {
        this.user = user;
    }

    public BitBucketSource getSource() {
        return source;
    }

    public void setSource(BitBucketSource source) {
        this.source = source;
    }

    public BitBucketSource getDestination() {
        return destination;
    }

    public void setDestination(BitBucketSource destination) {
        this.destination = destination;
    }

    public BitBucketCommit getMergeCommit() {
        return mergeCommit;
    }

    public void setMergeCommit(BitBucketCommit mergeCommit) {
        this.mergeCommit = mergeCommit;
    }

    public List<BitBucketOwner> getParticipants() {
        return participants;
    }

    public void setParticipants(List<BitBucketOwner> participants) {
        this.participants = participants;
    }

    public List<BitBucketOwner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<BitBucketOwner> reviewers) {
        this.reviewers = reviewers;
    }

    public Boolean getCloseSourceBranch() {
        return closeSourceBranch;
    }

    public void setCloseSourceBranch(Boolean closeSourceBranch) {
        this.closeSourceBranch = closeSourceBranch;
    }

    public BitBucketOwner getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(BitBucketOwner closedBy) {
        this.closedBy = closedBy;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }
}
