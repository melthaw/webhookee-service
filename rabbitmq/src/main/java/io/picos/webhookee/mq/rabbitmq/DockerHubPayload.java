package io.picos.webhookee.mq.rabbitmq;


import io.picos.webhookee.core.Route;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;

/**
 * @auther dz
 */
public class DockerHubPayload extends RabbitPayload {

    private DockerHubMessage message;

    public DockerHubPayload() {
    }

    public DockerHubPayload(Route route, DockerHubMessage message) {
        super(route);
        this.message = message;
    }

    public DockerHubMessage getMessage() {
        return message;
    }

    public void setMessage(DockerHubMessage message) {
        this.message = message;
    }

}
