package io.picos.webhookee.outcoming.worktile;


//{"text": "这是一条来自于Incoming Webhook的消息。\n并且消息还可以换行。"}

//{"user": "terry", "text": "这是一条来自于Incoming Webhook的消息。\n并且消息还可以换行。"}

//{
//    user: "sunjingyun",
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
//        {
//            title: "分区消息标题",
//            value: "分区消息内容",
//            short: 1 // 标识消息的内容时候时候为短消息
//        }
//        ]
//    }
//}

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkTileMessage {

    public static WorkTileMessage from(DockerHubMessage dockerHubMessage) {
        WorkTileMessage result = new WorkTileMessage();

        return result;
    }

    private String user;

    private String text;

    private WorkTileAttachment attachment;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public WorkTileAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(WorkTileAttachment attachment) {
        this.attachment = attachment;
    }

}
