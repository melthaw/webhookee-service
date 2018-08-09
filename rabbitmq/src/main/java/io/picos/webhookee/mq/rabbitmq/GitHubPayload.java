package io.picos.webhookee.mq.rabbitmq;


import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.github.GitHubMessage;

/**
 * @auther dz
 */
public class GitHubPayload extends RabbitPayload {

    private GitHubMessage message;

    public GitHubPayload() {
    }

    public GitHubPayload(Route route, GitHubMessage message) {
        super(route);
        this.message = message;
    }

    public GitHubMessage getMessage() {
        return message;
    }

    public void setMessage(GitHubMessage message) {
        this.message = message;
    }

}
