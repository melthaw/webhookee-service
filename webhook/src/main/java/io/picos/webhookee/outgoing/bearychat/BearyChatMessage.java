package io.picos.webhookee.outgoing.bearychat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.picos.webhookee.core.Payload;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

import java.util.ArrayList;
import java.util.List;

//{
//        "text": "text, this field may accept markdown",
//        "markdown": true,
//        "channel": "bearychat-dev",
//        "attachments": [
//            {
//                "title": "title_1",
//                "url": "https://bearychat.com",
//                "text": "attachment_text",
//                "color": "#ffa500",
//                "images": [
//                    {"url": "http://img3.douban.com/icon/ul15067564-30.jpg"}
//                ]
//            }
//        ]
//}

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BearyChatMessage implements Payload {

    public static final String MESSAGE_TYPE = "bearychat";

    public static BearyChatMessage from(CodingMessage payload) {
        BearyChatMessage result = new BearyChatMessage();


        return result;
    }

    public static BearyChatMessage from(GitHubMessage payload) {
        BearyChatMessage result = new BearyChatMessage();


        return result;
    }

    public static BearyChatMessage from(GitLabMessage payload) {
        BearyChatMessage result = new BearyChatMessage();


        return result;
    }

    public static BearyChatMessage from(BitBucketMessage payload) {
        BearyChatMessage result = new BearyChatMessage();

        return result;
    }

    public static BearyChatMessage from(DockerHubMessage dockerHubMessage) {
        BearyChatMessage result = new BearyChatMessage();

        BearyChatAttachment attachment = new BearyChatAttachment();
        attachment.setTitle(String.format("[%s/%s:%s] is created",
                                          dockerHubMessage.getRepository().getNamespace(),
                                          dockerHubMessage.getRepository().getRepoName(),
                                          dockerHubMessage.getPushData().getTag()));
        // FIXME: 2018/8/5
        attachment.setText(String.format("[%s/%s:%s] is created",
                                         dockerHubMessage.getRepository().getNamespace(),
                                         dockerHubMessage.getRepository().getRepoName(),
                                         dockerHubMessage.getPushData().getTag()));


        result.getAttachments().add(attachment);

        return result;
    }

    private String text;

    private boolean markdown = true;

    private String channel;

    private String user;

    private List<BearyChatAttachment> attachments = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isMarkdown() {
        return markdown;
    }

    public void setMarkdown(boolean markdown) {
        this.markdown = markdown;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<BearyChatAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<BearyChatAttachment> attachments) {
        this.attachments = attachments;
    }

}
