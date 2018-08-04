package io.picos.webhookee.management.rest.controller;

import io.picos.webhookee.management.rest.dto.RouteEntitySaveParam;
import io.picos.webhookee.management.rest.dto.RouteEntitySearchParam;
import io.picos.webhookee.management.rest.dto.RouteEntityView;
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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @auther dz
 */
@RequestMapping("/api")
@RestController
public class ManagementRestController {

    @Autowired
    private ManagementRestSupport managementRestSupport;

    @GetMapping("/route-entities")
    @ResponseStatus(HttpStatus.OK)
    public Page<RouteEntityView> search(RouteEntitySearchParam searchParam) {
        return managementRestSupport.search(searchParam);
    }

    @GetMapping("/route-entities/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RouteEntityView getDetail(@PathVariable String id) {
        return managementRestSupport.getDetail(id);
    }

    @PostMapping("/route-entities")
    @ResponseStatus(HttpStatus.CREATED)
    public RouteEntityView create(@RequestBody @Valid RouteEntitySaveParam saveParam) {
        return managementRestSupport.create(saveParam);
    }

    @PutMapping("/route-entities/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RouteEntityView update(@PathVariable String id, @RequestBody @Valid RouteEntitySaveParam saveParam) {
        return managementRestSupport.update(id, saveParam);
    }

    @DeleteMapping("/route-entities/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        managementRestSupport.delete(id);
    }

    @PutMapping("/route-entities/{id}/enable")
    @ResponseStatus(HttpStatus.OK)
    public RouteEntityView enable(@PathVariable String id) {
        return managementRestSupport.enable(id);
    }

    @PutMapping("/route-entities/{id}/disable")
    @ResponseStatus(HttpStatus.OK)
    public RouteEntityView disable(@PathVariable String id) {
        return managementRestSupport.disable(id);
    }

}
