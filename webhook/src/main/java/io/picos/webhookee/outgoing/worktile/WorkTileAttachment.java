package io.picos.webhookee.outgoing.worktile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

//{
//    attachment: {
//        fallback: "用于移动端将提示信息显示在首页上",
//        color: "#cccccc",  //将消息的正文用指定的颜色进行标示
//        pretext: "在显示消息正文之前显示的文本内容",
//        author_name: "Terry Lee",  //用于显示作者名
//        author_link: "https://github.com/terrylee",  //作者主页超链接
//        author_icon: "https://avatars1.githubusercontent.com/u/694592?v=3&s=400",  //作者
//        title: "消息正文标题",
//        title_link: "http://pro.worktile.com",
//        text: "普通文本消息，支持\n换行",
//
//        //多区域格式消息正文
//        fields: [
//            {
//              title: "分区消息标题",
//              value: "分区消息内容",
//               short: 1 // 标识消息的内容时候时候为短消息
//            }
//        ]
//    }
//}

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkTileAttachment {

    private String fallback;

    private String color;

    private String pretext;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("author_link")
    private String authorLink;

    @JsonProperty("author_icon")
    private String authorIcon;

    private String title;

    @JsonProperty("title_link")
    private String titleLink;

    private String text;

    private List<WorkTileField> fields = new ArrayList();

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPretext() {
        return pretext;
    }

    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public void setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<WorkTileField> getFields() {
        return fields;
    }

    public void setFields(List<WorkTileField> fields) {
        this.fields = fields;
    }
}
