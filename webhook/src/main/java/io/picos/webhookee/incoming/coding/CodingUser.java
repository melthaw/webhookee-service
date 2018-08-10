package io.picos.webhookee.incoming.coding;

//"sender": {
//    "id": 613,
//    "login": "jiong",
//    ...
//}

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
public class CodingUser {

    private String id;

    private String login;

    private String name;

    private String email;

    private String path;

    private String url;

    private String avatar;

    @JsonProperty("global_key")
    private String globalKey;

    @JsonProperty("html_url")
    private String htmlUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGlobalKey() {
        return globalKey;
    }

    public void setGlobalKey(String globalKey) {
        this.globalKey = globalKey;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
}
