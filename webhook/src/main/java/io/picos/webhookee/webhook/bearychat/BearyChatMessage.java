package io.picos.webhookee.webhook.bearychat;

import io.picos.webhookee.core.Payload;

import java.util.Date;

/**
 * @auther dz
 */
public class BearyChatMessage implements Payload {

    public static BearyChatMessage from(Payload payload) {
        if (payload instanceof BearyChatMessage) {
            return (BearyChatMessage) payload;
        }

        //
        BearyChatMessage result = new BearyChatMessage();
        return result;
    }

    @Override
    public String getWhat() {
        return null;
    }

    @Override
    public Date getWhen() {
        return null;
    }

    @Override
    public String getWho() {
        return null;
    }

}
