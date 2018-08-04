package io.picos.webhookee.outcoming.worktile;

import com.fasterxml.jackson.annotation.JsonProperty;

//    fields: [
//    {
//      title: "分区消息标题",
//      value: "分区消息内容",
//      short: 1 // 标识消息的内容时候时候为短消息
//    }

/**
 * @auther dz
 */
public class WorkTileField {

    private String title;

    private String value;

    @JsonProperty("short")
    private String _short;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }
}
