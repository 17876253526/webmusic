package com.secondgroud.front.webmusic.entity;

import java.util.Date;

public class Chats {
    private Integer chatsId;

    private String content;

    private String charsUrl;

    private Date time;

    private Integer fromId;

    private Integer toId;

    public Integer getChatsId() {
        return chatsId;
    }

    public void setChatsId(Integer chatsId) {
        this.chatsId = chatsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCharsUrl() {
        return charsUrl;
    }

    public void setCharsUrl(String charsUrl) {
        this.charsUrl = charsUrl == null ? null : charsUrl.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }
}