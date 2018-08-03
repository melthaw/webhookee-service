package io.picos.webhookee.rest.support;

import io.picos.webhookee.webhook.bearychat.BearyChatMessage;
import io.picos.webhookee.webhook.bitbucket.BitBucketMessage;
import io.picos.webhookee.webhook.coding.CodingMessage;
import io.picos.webhookee.webhook.dingding.DingDingMessage;
import io.picos.webhookee.webhook.dockerhub.DockerHubMessage;
import io.picos.webhookee.webhook.github.GitHubMessage;
import io.picos.webhookee.webhook.gitlab.GitLabMessage;
import io.picos.webhookee.webhook.teambition.TeamBitionMessage;
import io.picos.webhookee.webhook.worktile.WorkTileMessage;

/**
 * @auther dz
 */
public interface WebhookRestSupport {
    void processMessage(BitBucketMessage message);

    void processMessage(GitHubMessage message);

    void processMessage(GitLabMessage message);

    void processMessage(DockerHubMessage message);

    void processMessage(DingDingMessage message);

    void processMessage(BearyChatMessage message);

    void processMessage(CodingMessage message);

    void processMessage(WorkTileMessage message);

    void processMessage(TeamBitionMessage message);
}
