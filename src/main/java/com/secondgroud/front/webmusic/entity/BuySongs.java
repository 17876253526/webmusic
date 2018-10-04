package com.secondgroud.front.webmusic.entity;

import java.util.Date;

public class BuySongs {
    private Integer buySongsId;

    private Date time;

    private Integer buySongsUser;

    private Integer buySong;

    public Integer getBuySongsId() {
        return buySongsId;
    }

    public void setBuySongsId(Integer buySongsId) {
        this.buySongsId = buySongsId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getBuySongsUser() {
        return buySongsUser;
    }

    public void setBuySongsUser(Integer buySongsUser) {
        this.buySongsUser = buySongsUser;
    }

    public Integer getBuySong() {
        return buySong;
    }

    public void setBuySong(Integer buySong) {
        this.buySong = buySong;
    }
}