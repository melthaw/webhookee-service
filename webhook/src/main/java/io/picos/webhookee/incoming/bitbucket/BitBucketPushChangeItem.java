package io.picos.webhookee.incoming.bitbucket;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class BitBucketPushChangeItem {

    private String type;

    private String name;

    private BitBucketPushTarget target;

    private BitBucketLink links;

    @JsonProperty("default_merge_strategy")
    private String defaultMergeStrategy;

    @JsonProperty("merge_strategies")
    private String[] mergeStrategies;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BitBucketPushTarget getTarget() {
        return target;
    }

    public void setTarget(BitBucketPushTarget target) {
        this.target = target;
    }

    public BitBucketLink getLinks() {
        return links;
    }

    public void setLinks(BitBucketLink links) {
        this.links = links;
    }

    public String getDefaultMergeStrategy() {
        return defaultMergeStrategy;
    }

    public void setDefaultMergeStrategy(String defaultMergeStrategy) {
        this.defaultMergeStrategy = defaultMergeStrategy;
    }

    public String[] getMergeStrategies() {
        return mergeStrategies;
    }

    public void setMergeStrategies(String[] mergeStrategies) {
        this.mergeStrategies = mergeStrategies;
    }
}
