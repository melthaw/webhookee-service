package io.picos.webhookee.outcoming.dingding;

/**
 * @auther dz
 */
public class DingDingButton {

    private String title;//": "内容不错",

    private String actionURL;//": "https://www.dingtalk.com/"

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActionURL() {
        return actionURL;
    }

    public void setActionURL(String actionURL) {
        this.actionURL = actionURL;
    }
}
