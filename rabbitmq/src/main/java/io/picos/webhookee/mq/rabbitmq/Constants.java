package io.picos.webhookee.mq.rabbitmq;

import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

/**
 * @auther dz
 */
public class Constants {

    public static final String WEBHOOKEE_DOCKERHUB_QUEUE = "io.picos.webhookee#" + DockerHubMessage.MESSAGE_TYPE;

    public static final String WEBHOOKEE_CODING_QUEUE = "io.picos.webhookee#" + CodingMessage.MESSAGE_TYPE;

    public static final String WEBHOOKEE_BITBUCKET_QUEUE = "io.picos.webhookee#" + BitBucketMessage.MESSAGE_TYPE;

    public static final String WEBHOOKEE_GITHUB_QUEUE = "io.picos.webhookee#" + GitHubMessage.MESSAGE_TYPE;

    public static final String WEBHOOKEE_GITLAB_QUEUE = "io.picos.webhookee#" + GitLabMessage.MESSAGE_TYPE;

}
