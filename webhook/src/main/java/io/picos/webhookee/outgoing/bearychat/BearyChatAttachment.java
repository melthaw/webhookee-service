package io.picos.webhookee.outgoing.bearychat;

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

import java.util.ArrayList;
import java.util.List;

/**
 * @auther dz
 */
public class BearyChatAttachment {

    private String title;

    private String url;

    private String text;

    private String color;

    private List<BearyChatImage> images = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<BearyChatImage> getImages() {
        return images;
    }

    public void setImages(List<BearyChatImage> images) {
        this.images = images;
    }
}
