package io.picos.webhookee.outgoing.slack;

import io.picos.webhookee.core.Payload;

/**
 * @auther dz
 */
public class SlackMessage implements Payload {

    public static final String MESSAGE_TYPE = "slack";

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
