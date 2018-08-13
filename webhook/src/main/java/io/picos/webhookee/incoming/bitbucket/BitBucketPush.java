package io.picos.webhookee.incoming.bitbucket;

import java.util.List;

/**
 * @auther dz
 */
public class BitBucketPush {

    private List<BitBucketPushChange> changes;

    public List<BitBucketPushChange> getChanges() {
        return changes;
    }

    public void setChanges(List<BitBucketPushChange> changes) {
        this.changes = changes;
    }
}
