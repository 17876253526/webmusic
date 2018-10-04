package com.secondgroud.front.webmusic.entity;

public class Singer {
    private Integer singId;

    private Long fansNum;

    private Integer singerUser;

    private String selfintro;

    public Integer getSingId() {
        return singId;
    }

    public void setSingId(Integer singId) {
        this.singId = singId;
    }

    public Long getFansNum() {
        return fansNum;
    }

    public void setFansNum(Long fansNum) {
        this.fansNum = fansNum;
    }

    public Integer getSingerUser() {
        return singerUser;
    }

    public void setSingerUser(Integer singerUser) {
        this.singerUser = singerUser;
    }

    public String getSelfintro() {
        return selfintro;
    }

    public void setSelfintro(String selfintro) {
        this.selfintro = selfintro == null ? null : selfintro.trim();
    }
}