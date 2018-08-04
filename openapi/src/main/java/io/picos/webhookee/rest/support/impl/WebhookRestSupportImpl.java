package io.picos.webhookee.rest.support.impl;

import io.picos.webhookee.outcoming.slack.SlackMessage;
import io.picos.webhookee.rest.support.WebhookRestSupport;
import io.picos.webhookee.outcoming.bearychat.BearyChatMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.outcoming.dingding.DingDingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.outcoming.teambition.TeamBitionMessage;
import io.picos.webhookee.outcoming.worktile.WorkTileMessage;
import org.springframework.stereotype.Component;

/**
 * @auther dz
 */
@Component
public class WebhookRestSupportImpl implements WebhookRestSupport {


    @Override
    public void processMessage(String id, BitBucketMessage message) {

    }

    @Override
    public void processMessage(String id, GitHubMessage message) {

    }

    @Override
    public void processMessage(String id, GitLabMessage message) {

    }

    @Override
    public void processMessage(String id, DockerHubMessage message) {

    }

    @Override
    public void processMessage(String id, CodingMessage message) {

    }

    @Override
    public void processMessage(String id, SlackMessage message) {

    }

    @Override
    public void processMessage(String id, DingDingMessage message) {

    }

    @Override
    public void processMessage(String id, BearyChatMessage message) {

    }

    @Override
    public void processMessage(String id, WorkTileMessage message) {

    }

    @Override
    public void processMessage(String id, TeamBitionMessage message) {

    }
}
