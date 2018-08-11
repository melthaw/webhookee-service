package io.picos.webhookee.outgoing.dingding;

import io.picos.webhookee.core.WebhookMessage;
import io.picos.webhookee.incoming.bitbucket.BitBucketMessage;
import io.picos.webhookee.incoming.coding.CodingMessage;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.incoming.github.GitHubMessage;
import io.picos.webhookee.incoming.gitlab.GitLabMessage;

import java.util.Date;

/**
 * @auther dz
 */
public class DingDingMessage implements WebhookMessage {

    public static final String MESSAGE_TYPE = "dingding";

    public static final String TEXT_TYPE = "text";

    public static final String LINK_TYPE = "link";

    public static final String MARKDOWN_TYPE = "markdown";

    public static final String ACTIONCARD_TYPE = "actionCard";

    public static final String FREECARD_TYPE = "freeCard";

    private String msgtype;

    private DingDingText text;

    private DingDingAt at;

    private DingDingLink link;

    private DingDingMarkDown markdown;

    private DingDingActionCard actionCard;

    private DingDingFreeCard freeCard;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public DingDingText getText() {
        return text;
    }

    public void setText(DingDingText text) {
        this.text = text;
    }

    public DingDingAt getAt() {
        return at;
    }

    public void setAt(DingDingAt at) {
        this.at = at;
    }

    public DingDingLink getLink() {
        return link;
    }

    public void setLink(DingDingLink link) {
        this.link = link;
    }

    public DingDingMarkDown getMarkdown() {
        return markdown;
    }

    public void setMarkdown(DingDingMarkDown markdown) {
        this.markdown = markdown;
    }

    public DingDingActionCard getActionCard() {
        return actionCard;
    }

    public void setActionCard(DingDingActionCard actionCard) {
        this.actionCard = actionCard;
    }

    public DingDingFreeCard getFreeCard() {
        return freeCard;
    }

    public void setFreeCard(DingDingFreeCard freeCard) {
        this.freeCard = freeCard;
    }
}
