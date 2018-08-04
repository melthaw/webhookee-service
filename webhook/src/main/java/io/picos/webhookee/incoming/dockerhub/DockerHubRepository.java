package io.picos.webhookee.incoming.dockerhub;


//    "repository": {
//        "comment_count": 0,
//        "date_created": 1.417494799e+09,
//        "description": "",
//        "dockerfile": "#\n# BUILD\u0009\u0009docker build -t svendowideit/apt-cacher .\n# RUN\u0009\u0009docker run -d -p 3142:3142 -name apt-cacher-run apt-cacher\n#\n# and then you can run containers with:\n# \u0009\u0009docker run -t -i -rm -e http_proxy http://192.168.1.2:3142/ debian bash\n#\nFROM\u0009\u0009ubuntu\n\n\nVOLUME\u0009\u0009[\/var/cache/apt-cacher-ng\]\nRUN\u0009\u0009apt-get update ; apt-get install -yq apt-cacher-ng\n\nEXPOSE \u0009\u00093142\nCMD\u0009\u0009chmod 777 /var/cache/apt-cacher-ng ; /etc/init.d/apt-cacher-ng start ; tail -f /var/log/apt-cacher-ng/*\n",
//        "full_description": "Docker Hub based automated build from a GitHub repo",
//        "is_official": false,
//        "is_private": true,
//        "is_trusted": true,
//        "name": "testhook",
//        "namespace": "svendowideit",
//        "owner": "svendowideit",
//        "repo_name": "svendowideit/testhook",
//        "repo_url": "https://registry.hub.docker.com/u/svendowideit/testhook/",
//        "star_count": 0,
//        "status": "Active"
//    }

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @auther dz
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DockerHubRepository {

    @JsonProperty("comment_count")
    private int commentCount;

    @JsonProperty("date_created")
    private long dateCreated;

    private String description;

    private String dockerfile;

    @JsonProperty("full_description")
    private String fullDescription;

    @JsonProperty("is_official")
    private boolean official;

    @JsonProperty("is_private")
    private boolean _private;

    @JsonProperty("is_trusted")
    private boolean trusted;

    private String name;

    private String namespace;

    private String owner;

    @JsonProperty("repo_name")
    private String repoName;

    @JsonProperty("repo_url")
    private String repoUrl;

    @JsonProperty("star_count")
    private int starCount;

    private String status;

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDockerfile() {
        return dockerfile;
    }

    public void setDockerfile(String dockerfile) {
        this.dockerfile = dockerfile;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean aPrivate) {
        _private = aPrivate;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
