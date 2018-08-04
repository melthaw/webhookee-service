package io.picos.webhookee.outgoing.dingding;

/**
 * @auther dz
 */
public class DingDingMessage {

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
