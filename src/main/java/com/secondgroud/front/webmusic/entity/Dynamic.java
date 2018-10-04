package entity;

import java.util.Date;

public class Dynamic {
    private Integer dynamicId;

    private Date time;

    private Long likeNum;

    private Integer dynamicUser;

    private Integer dynamicSong;

    private Integer dynamicCommentIncrease;

    private String content;

    public Integer getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Long likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getDynamicUser() {
        return dynamicUser;
    }

    public void setDynamicUser(Integer dynamicUser) {
        this.dynamicUser = dynamicUser;
    }

    public Integer getDynamicSong() {
        return dynamicSong;
    }

    public void setDynamicSong(Integer dynamicSong) {
        this.dynamicSong = dynamicSong;
    }

    public Integer getDynamicCommentIncrease() {
        return dynamicCommentIncrease;
    }

    public void setDynamicCommentIncrease(Integer dynamicCommentIncrease) {
        this.dynamicCommentIncrease = dynamicCommentIncrease;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}