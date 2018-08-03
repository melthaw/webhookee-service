package io.picos.webhookee.rest.controller;

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

    @PostMapping("/bitbucket")
    @ResponseStatus(HttpStatus.OK)
    public void bitbucket(@RequestBody BitBucketMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/github")
    @ResponseStatus(HttpStatus.OK)
    public void github(@RequestBody GitHubMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/gitlab")
    @ResponseStatus(HttpStatus.OK)
    public void gitlab(@RequestBody GitLabMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/dockerhub")
    @ResponseStatus(HttpStatus.OK)
    public void dockerhub(@RequestBody DockerHubMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/slack")
    @ResponseStatus(HttpStatus.OK)
    public void slack(@RequestBody BitBucketMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/dingding")
    @ResponseStatus(HttpStatus.OK)
    public void dingding(@RequestBody DingDingMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/bearychat")
    @ResponseStatus(HttpStatus.OK)
    public void bearychat(@RequestBody BearyChatMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/coding")
    @ResponseStatus(HttpStatus.OK)
    public void coding(@RequestBody CodingMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/worktile")
    @ResponseStatus(HttpStatus.OK)
    public void worktile(@RequestBody WorkTileMessage message) {
        webhookRestSupport.processMessage(message);
    }

    @PostMapping("/teambition")
    @ResponseStatus(HttpStatus.OK)
    public void teambition(@RequestBody TeamBitionMessage message) {
        webhookRestSupport.processMessage(message);
    }

}
