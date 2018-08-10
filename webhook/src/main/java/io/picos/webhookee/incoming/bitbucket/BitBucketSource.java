package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketSource {

    private BitBucketBranch branch;

    private BitBucketCommit commit;

    private BitBucketRepository repository;

    public BitBucketBranch getBranch() {
        return branch;
    }

    public void setBranch(BitBucketBranch branch) {
        this.branch = branch;
    }

    public BitBucketCommit getCommit() {
        return commit;
    }

    public void setCommit(BitBucketCommit commit) {
        this.commit = commit;
    }

    public BitBucketRepository getRepository() {
        return repository;
    }

    public void setRepository(BitBucketRepository repository) {
        this.repository = repository;
    }
}
