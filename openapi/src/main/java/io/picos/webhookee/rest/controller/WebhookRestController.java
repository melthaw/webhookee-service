package io.picos.webhookee.rest.controller;

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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @auther dz
 */
@RequestMapping("/api")
@RestController
public class WebhookRestController {

    @Autowired
    private WebhookRestSupport webhookRestSupport;

    @PostMapping("/bitbucket/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void bitbucket(@PathVariable String id,
                          @RequestHeader("X-Event-Key") String eventKey,
                          @RequestHeader("X-Hook-UUID") String hookUuid,
                          @RequestHeader("X-Request-UUID") String requestUuid,
                          @RequestHeader("X-Attempt-Number") String attemptNumber,
                          @RequestBody BitBucketMessage message) {
        webhookRestSupport.processMessage(id, eventKey, message);
    }

    @PostMapping("/github/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void github(@PathVariable String id, @RequestBody GitHubMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/gitlab/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void gitlab(@PathVariable String id, @RequestBody GitLabMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/dockerhub/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void dockerhub(@PathVariable String id, @RequestBody DockerHubMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/coding/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void coding(@PathVariable String id, @RequestBody CodingMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    //quick test for IM

    @PostMapping("/slack/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void slack(@PathVariable String id, @RequestBody BitBucketMessage message) {
        webhookRestSupport.processMessage(id, id, message);
    }

    @PostMapping("/dingding/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void dingding(@PathVariable String id, @RequestBody DingDingMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/bearychat/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void bearychat(@PathVariable String id, @RequestBody BearyChatMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/worktile/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void worktile(@PathVariable String id, @RequestBody WorkTileMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

    @PostMapping("/teambition/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void teambition(@PathVariable String id, @RequestBody TeamBitionMessage message) {
        webhookRestSupport.processMessage(id, message);
    }

}
