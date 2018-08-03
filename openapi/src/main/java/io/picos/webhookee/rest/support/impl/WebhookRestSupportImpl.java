package io.picos.webhookee.rest.support.impl;

import io.picos.webhookee.rest.support.WebhookRestSupport;
import io.picos.webhookee.webhook.bearychat.BearyChatMessage;
import io.picos.webhookee.webhook.bitbucket.BitBucketMessage;
import io.picos.webhookee.webhook.coding.CodingMessage;
import io.picos.webhookee.webhook.dingding.DingDingMessage;
import io.picos.webhookee.webhook.dockerhub.DockerHubMessage;
import io.picos.webhookee.webhook.github.GitHubMessage;
import io.picos.webhookee.webhook.gitlab.GitLabMessage;
import io.picos.webhookee.webhook.teambition.TeamBitionMessage;
import io.picos.webhookee.webhook.worktile.WorkTileMessage;
import org.springframework.stereotype.Component;

/**
 * @auther dz
 */
@Component
public class WebhookRestSupportImpl implements WebhookRestSupport {


    @Override
    public void processMessage(BitBucketMessage message) {

    }

    @Override
    public void processMessage(GitHubMessage message) {

    }

    @Override
    public void processMessage(GitLabMessage message) {

    }

    @Override
    public void processMessage(DockerHubMessage message) {

    }

    @Override
    public void processMessage(DingDingMessage message) {

    }

    @Override
    public void processMessage(BearyChatMessage message) {

    }

    @Override
    public void processMessage(CodingMessage message) {

    }

    @Override
    public void processMessage(WorkTileMessage message) {

    }

    @Override
    public void processMessage(TeamBitionMessage message) {

    }
}
