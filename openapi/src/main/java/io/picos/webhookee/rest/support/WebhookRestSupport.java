package io.picos.webhookee.rest.support;

import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.outgoing.dingding.DingDingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.outgoing.slack.SlackMessage;
import io.picos.webhookee.outgoing.teambition.TeamBitionMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;

/**
 * @auther dz
 */
public interface WebhookRestSupport {

    void processMessage(String id, String eventKey, BitBucketMessage message);

    void processMessage(String id, GitHubMessage message);

    void processMessage(String id, GitLabMessage message);

    void processMessage(String id, DockerHubMessage message);

    void processMessage(String id, String codingEvent, CodingMessage message);

    void processMessage(String id, SlackMessage message);

    void processMessage(String id, DingDingMessage message);

    void processMessage(String id, BearyChatMessage message);

    void processMessage(String id, WorkTileMessage message);

    void processMessage(String id, TeamBitionMessage message);
}
