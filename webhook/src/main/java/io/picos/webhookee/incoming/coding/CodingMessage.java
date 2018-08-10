package io.picos.webhookee.incoming.coding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.picos.webhookee.core.WebhookMessage;

import java.util.List;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CodingMessage implements WebhookMessage {

    public static final String MESSAGE_TYPE = "coding";

    private String event;

    private String token;

    private String type;

    private String zen;

    @JsonProperty("hook_id")
    private String hookId;

    private String hook;

    private String ref;

    private String before;

    private String after;

    private String compare;

    private String action;

    private String number;

    private String task;

    private String member;

    private List<CodingCommit> commits;

    @JsonProperty("head_commit")
    private String headCommit;

    private CodingRepository repository;

    private CodingUser sender;

    private CodingMergeRequest mergeRequest;

    private CodingDocument document;

    private CodingTopic topic;

    @JsonProperty("target_user")
    private CodingUser targetUser;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZen() {
        return zen;
    }

    public void setZen(String zen) {
        this.zen = zen;
    }

    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    public String getHook() {
        return hook;
    }

    public void setHook(String hook) {
        this.hook = hook;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public List<CodingCommit> getCommits() {
        return commits;
    }

    public void setCommits(List<CodingCommit> commits) {
        this.commits = commits;
    }

    public String getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(String headCommit) {
        this.headCommit = headCommit;
    }

    public CodingRepository getRepository() {
        return repository;
    }

    public void setRepository(CodingRepository repository) {
        this.repository = repository;
    }

    public CodingUser getSender() {
        return sender;
    }

    public void setSender(CodingUser sender) {
        this.sender = sender;
    }

    public CodingMergeRequest getMergeRequest() {
        return mergeRequest;
    }

    public void setMergeRequest(CodingMergeRequest mergeRequest) {
        this.mergeRequest = mergeRequest;
    }

    public CodingDocument getDocument() {
        return document;
    }

    public void setDocument(CodingDocument document) {
        this.document = document;
    }

    public CodingTopic getTopic() {
        return topic;
    }

    public void setTopic(CodingTopic topic) {
        this.topic = topic;
    }

    public CodingUser getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(CodingUser targetUser) {
        this.targetUser = targetUser;
    }
}
