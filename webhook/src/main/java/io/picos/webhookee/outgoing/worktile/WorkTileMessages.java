package io.picos.webhookee.outgoing.worktile;

import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

import java.util.Date;

/**
 * @auther dz
 */
public class WorkTileMessages {

    public static WorkTileMessage from(CodingMessage payload) {
        WorkTileMessage result = new WorkTileMessage();

        return result;
    }

    public static WorkTileMessage from(GitHubMessage payload) {
        WorkTileMessage result = new WorkTileMessage();


        return result;
    }

    public static WorkTileMessage from(GitLabMessage payload) {
        WorkTileMessage result = new WorkTileMessage();


        return result;
    }

    public static WorkTileMessage from(BitBucketMessage payload) {
        WorkTileMessage result = new WorkTileMessage();


        return result;
    }

    public static WorkTileMessage from(DockerHubMessage dockerHubMessage) {
        WorkTileMessage result = new WorkTileMessage();

        WorkTileAttachment attachment = new WorkTileAttachment();
        attachment.setFallback("[DockerHub]");
        attachment.setColor("#aaaaaa");

        attachment.setTitle(String.format("[%s/%s:%s] is pushed",
                                          dockerHubMessage.getRepository().getNamespace(),
                                          dockerHubMessage.getRepository().getRepoName(),
                                          dockerHubMessage.getPushData().getTag()));

        WorkTileField field = new WorkTileField();
        field.setTitle(String.format("Repository: %s/%s",
                                     dockerHubMessage.getRepository().getNamespace(),
                                     dockerHubMessage.getRepository().getRepoName()));
        attachment.getFields().add(field);

        field = new WorkTileField();
        field.setTitle(String.format("Tag: %s", dockerHubMessage.getPushData().getTag()));
        attachment.getFields().add(field);

        field = new WorkTileField();
        field.setTitle(String.format("Pusher: %s", dockerHubMessage.getPushData().getPusher()));
        attachment.getFields().add(field);

        if (dockerHubMessage.getPushData().getPushedAt() > 0) {
            field = new WorkTileField();
            field.setTitle(String.format("Pushed At : %tF %tT",
                                         new Date(dockerHubMessage.getPushData().getPushedAt()),
                                         new Date(dockerHubMessage.getPushData().getPushedAt())));
            attachment.getFields().add(field);
        }

        result.setAttachment(attachment);

        return result;
    }

}
