package io.picos.webhookee.outgoing.slack;

import java.util.ArrayList;
import java.util.List;

//"attachments": [
//        {
//        "fallback": "Plan a vacation",
//        "author_name": "Owner: rdesoto",
//        "title": "Plan a vacation",
//        "text": "I've been working too hard, it's time for a break.",
//        "actions": [
//            {
//                "name": "action",
//                "type": "button",
//                "text": "Complete this task",
//                "style": "",
//                "value": "complete"
//            },
//            {
//                "name": "tags_list",
//                "type": "select",
//                "text": "Add a tag...",
//                "data_source": "static",
//                "options": [
//                    {
//                        "text": "Launch Blocking",
//                        "value": "launch-blocking"
//                    },
//                    {
//                        "text": "Enhancement",
//                        "value": "enhancement"
//                    },
//                    {
//                        "text": "Bug",
//                        "value": "bug"
//                    }
//                ]
//            }
//        ]
//        }
//]

/**
 * @auther dz
 */
public class SlackAttachment {

    private String fallback;

    //TODO json format : author_name
    private String authorName;

    private String title;

    private String text;

    private List<SlackAction> actions = new ArrayList<SlackAction>();

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<SlackAction> getActions() {
        return actions;
    }

    public void setActions(List<SlackAction> actions) {
        this.actions = actions;
    }
}
