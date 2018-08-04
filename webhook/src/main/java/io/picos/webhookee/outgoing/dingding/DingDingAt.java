package io.picos.webhookee.outgoing.dingding;

/**
 * @auther dz
 */
public class DingDingAt {

    private String[] atMobiles = new String[] {};

    private boolean isAtAll = false;

    public String[] getAtMobiles() {
        return atMobiles;
    }

    public void setAtMobiles(String[] atMobiles) {
        this.atMobiles = atMobiles;
    }

    public boolean isAtAll() {
        return isAtAll;
    }

    public void setAtAll(boolean atAll) {
        isAtAll = atAll;
    }
}
