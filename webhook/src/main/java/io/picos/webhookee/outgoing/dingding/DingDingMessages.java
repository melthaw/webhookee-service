package io.picos.webhookee.outgoing.dingding;

import io.picos.webhookee.incoming.bitbucket.BitBucketEventTypes;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

import java.util.Date;

/**
 * @auther dz
 */
public class DingDingMessages {

    public static DingDingMessage from(CodingMessage payload) {
        DingDingMessage result = new DingDingMessage();

        return result;
    }

    public static DingDingMessage from(GitHubMessage payload) {
        DingDingMessage result = new DingDingMessage();


        return result;
    }

    public static DingDingMessage from(GitLabMessage payload) {
        DingDingMessage result = new DingDingMessage();


        return result;
    }

    public static DingDingMessage from(BitBucketMessage bitBucketMessage) {
        DingDingMessage result = new DingDingMessage();

        if (BitBucketEventTypes.REPO_PUSH.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_FORK.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_UPDATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_TRANSFER.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_COMMIT_COMMENT_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_COMMIT_STATUS_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.REPO_COMMIT_STATUS_UPDATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.ISSUE_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.ISSUE_UPDATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.ISSUE_COMMENT_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_UPDATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_APPROVED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_UNAPPROVED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_FULFILLED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_REJECTED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_COMMENT_CREATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_COMMENT_UPDATED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }
        else if (BitBucketEventTypes.PULLREQUEST_COMMENT_DELETED.equals(bitBucketMessage.getHeader().getEventKey())) {

        }

        return result;
    }

    public static DingDingMessage from(DockerHubMessage dockerHubMessage) {
        DingDingMessage result = new DingDingMessage();

        DingDingMarkDown markDown = new DingDingMarkDown();
        markDown.setTitle(String.format("DockerHub: %s:%s is pushed",
                                        dockerHubMessage.getRepository().getRepoName(),
                                        dockerHubMessage.getPushData().getTag()));

        StringBuffer markDownContent = new StringBuffer();
        markDownContent.append(String.format("## [DockerHub] %s:%s is pushed",
                                             dockerHubMessage.getRepository().getRepoName(),
                                             dockerHubMessage.getPushData().getTag()))
                       .append("\n\n")
                       .append(String.format("Repository: %s",
                                             dockerHubMessage.getRepository().getRepoName()))
                       .append("\n\n")
                       .append(String.format("Tag: %s", dockerHubMessage.getPushData().getTag()))
                       .append("\n\n")
                       .append(String.format("Pusher: %s", dockerHubMessage.getPushData().getPusher()))
                       .append("\n\n")
                       .append(String.format("Pushed At : %tF %tT",
                                             new Date(dockerHubMessage.getPushData().getPushedAt()),
                                             new Date(dockerHubMessage.getPushData().getPushedAt())));
        markDown.setText(markDownContent.toString());

        result.setMsgtype("markdown");
        result.setMarkdown(markDown);

        return result;
    }

}
