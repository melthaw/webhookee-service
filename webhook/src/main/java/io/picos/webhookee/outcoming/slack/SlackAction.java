package io.picos.webhookee.outcoming.slack;

import java.util.ArrayList;
import java.util.List;

//    "actions": [
//        {
//            "name": "action",
//            "type": "button",
//            "text": "Complete this task",
//            "style": "",
//            "value": "complete"
//        },
//        {
//            "name": "tags_list",
//            "type": "select",
//            "text": "Add a tag...",
//            "data_source": "static",
//            "options": [
//                {
//                    "text": "Launch Blocking",
//                    "value": "launch-blocking"
//                },
//                {
//                    "text": "Enhancement",
//                    "value": "enhancement"
//                },
//                {
//                    "text": "Bug",
//                    "value": "bug"
//                }
//            ]
//        }
//    ]

/**
 * @auther dz
 */
public class SlackAction {

    public static final String BUTTON_TYPE = "button";
    public static final String SELECT_TYPE = "select";

    private String name;

    private String type;

    private String text;

    private String style;

    private String value;

    //TODO json format : data_source
    private String dataSource;

    private List<SlackSelectOption> options = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public List<SlackSelectOption> getOptions() {
        return options;
    }

    public void setOptions(List<SlackSelectOption> options) {
        this.options = options;
    }
}
