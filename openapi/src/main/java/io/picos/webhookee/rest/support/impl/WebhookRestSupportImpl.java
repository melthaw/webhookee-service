package io.picos.webhookee.rest.support.impl;

import io.picos.webhookee.core.Route;
import io.picos.webhookee.core.Router;
import io.picos.webhookee.exception.RouteConflictException;
import io.picos.webhookee.exception.RouteDisabledException;
import io.picos.webhookee.exception.RouteNotFoundException;
import io.picos.webhookee.incoming.bitbucket.BitBucketHeader;
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
import org.apache.commons.lang3.StringUtils;
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
        Route route = validateAndReturn(id);

        if (!BitBucketMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           BitBucketMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        BitBucketHeader header = new BitBucketHeader();
        header.setEventKey(eventKey);
        message.setHeader(header);

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, GitHubMessage message) {
        Route route = validateAndReturn(id);

        if (!GitHubMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           GitHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, GitLabMessage message) {
        Route route = validateAndReturn(id);

        if (!GitLabMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           GitLabMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, DockerHubMessage message) {
        Route route = validateAndReturn(id);

        if (!DockerHubMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DockerHubMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, String codingEvent, CodingMessage message) {
        Route route = validateAndReturn(id);

        if (!CodingMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           CodingMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        message.setEvent(codingEvent);
        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, SlackMessage message) {
        Route route = validateAndReturn(id);

        if (!SlackMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           SlackMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, DingDingMessage message) {
        Route route = validateAndReturn(id);

        if (!DingDingMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           DingDingMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, BearyChatMessage message) {
        Route route = validateAndReturn(id);

        if (!BearyChatMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           BearyChatMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, WorkTileMessage message) {
        Route route = validateAndReturn(id);

        if (!WorkTileMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           WorkTileMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    @Override
    public void processMessage(String id, TeamBitionMessage message) {
        Route route = validateAndReturn(id);

        if (!TeamBitionMessage.MESSAGE_TYPE.equals(route.getType())) {
            throw new RouteConflictException(String.format("expect %s but %s",
                                                           TeamBitionMessage.MESSAGE_TYPE,
                                                           route.getType()));
        }

        messageProducer.produce(route, message);
    }

    private Route validateAndReturn(String id) {
        Route route = router.findRoute(id);
        if (route == null) {
            throw new RouteNotFoundException(String.format("The route[%s] not found", id));
        }

        if (!route.isEnabled()) {
            throw new RouteDisabledException("The route is disabled");
        }

        return route;
    }

}
