package io.picos.webhookee.mq.rabbitmq;


import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

/**
 * @auther dz
 */
public class GitLabPayload extends RabbitPayload {

    private GitLabMessage message;

    public GitLabPayload() {
    }

    public GitLabPayload(Route route, GitLabMessage message) {
        super(route);
        this.message = message;
    }

    public GitLabMessage getMessage() {
        return message;
    }

    public void setMessage(GitLabMessage message) {
        this.message = message;
    }

}
