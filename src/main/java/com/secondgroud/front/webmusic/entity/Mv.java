package com.secondgroud.front.webmusic.entity;

import java.util.Date;

public class Mv {
    private Integer mvId;

    private Date uploadtime;

    private Long playback;

    private Long collection;

    private Long download;

    private Integer integral;

    private String mvPicUrl;

    private Integer mvSong;

    private Integer mvKindIncrease;

    private Integer mvCommentIncrease;

    public Integer getMvId() {
        return mvId;
    }

    public void setMvId(Integer mvId) {
        this.mvId = mvId;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Long getPlayback() {
        return playback;
    }

    public void setPlayback(Long playback) {
        this.playback = playback;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public Long getDownload() {
        return download;
    }

    public void setDownload(Long download) {
        this.download = download;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getMvPicUrl() {
        return mvPicUrl;
    }

    public void setMvPicUrl(String mvPicUrl) {
        this.mvPicUrl = mvPicUrl == null ? null : mvPicUrl.trim();
    }

    public Integer getMvSong() {
        return mvSong;
    }

    public void setMvSong(Integer mvSong) {
        this.mvSong = mvSong;
    }

    public Integer getMvKindIncrease() {
        return mvKindIncrease;
    }

    public void setMvKindIncrease(Integer mvKindIncrease) {
        this.mvKindIncrease = mvKindIncrease;
    }

    public Integer getMvCommentIncrease() {
        return mvCommentIncrease;
    }

    public void setMvCommentIncrease(Integer mvCommentIncrease) {
        this.mvCommentIncrease = mvCommentIncrease;
    }
}