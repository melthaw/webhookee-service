package io.picos.webhookee.outcoming.slack;


//    "options": [
//        {
//            "text": "Launch Blocking",
//            "value": "launch-blocking"
//        },
//        {
//            "text": "Enhancement",
//            "value": "enhancement"
//        },
//        {
//            "text": "Bug",
//            "value": "bug"
//        }
//    ]

/**
 * @auther dz
 */
public class SlackSelectOption {

    private String text;

    private String value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
