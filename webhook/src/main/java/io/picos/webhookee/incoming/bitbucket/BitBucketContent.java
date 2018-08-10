package io.picos.webhookee.incoming.bitbucket;

/**
 * @auther dz
 */
public class BitBucketContent {

    private String raw;

    private String html;

    private String markup;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getMarkup() {
        return markup;
    }

    public void setMarkup(String markup) {
        this.markup = markup;
    }

}
