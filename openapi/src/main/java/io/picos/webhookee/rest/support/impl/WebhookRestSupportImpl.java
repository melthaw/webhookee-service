package io.picos.webhookee.rest.support.impl;

import io.picos.webhookee.core.Route;
import io.picos.webhookee.core.Router;
import io.picos.webhookee.exception.RouteConflictException;
import io.picos.webhookee.exception.RouteNotFoundException;
import io.picos.webhookee.message.MessageProducer;
import io.picos.webhookee.outgoing.slack.SlackMessage;
import io.picos.webhookee.rest.support.WebhookRestSupport;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.outgoing.dingding.DingDingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;
import io.picos.webhookee.outgoing.teambition.TeamBitionMessage;
import io.picos.webhookee.outgoing.worktile.WorkTileMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther dz
 */
@Component
public class WebhookRestSupportImpl implements WebhookRestSupport {

    @Autowired
    private Router router;

    @Autowired
    private MessageProducer messageProducer;

    @Override
    public void processMessage(String id, String eventKey, BitBucketMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!BitBucketMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, GitHubMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!GitHubMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, GitLabMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!GitLabMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, DockerHubMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!DockerHubMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, CodingMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!CodingMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, SlackMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!SlackMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, DingDingMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!DingDingMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, BearyChatMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!BearyChatMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, WorkTileMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!WorkTileMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, TeamBitionMessage message) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(id);
        }

        if (!TeamBitionMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

}
