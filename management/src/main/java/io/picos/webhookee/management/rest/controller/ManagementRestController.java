package io.picos.webhookee.management.rest.controller;

import io.picos.webhookee.management.rest.support.ManagementRestSupport;
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
public class ManagementRestController {

    @Autowired
    private ManagementRestSupport managementRestSupport;


}
