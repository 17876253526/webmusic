package entity;

import java.util.Date;

public class Song {
    private Integer songId;

    private String name;

    private String picUrl;

    private Byte isActive;

    private Byte isVip;

    private String size;

    private String storageUrl;

    private Long playback;

    private Long collection;

    private Date uploadTime;

    private String durationTime;

    private Integer integral;

    private Integer songAlbum;

    private Integer songKindIncrease;

    private Integer songCommentIncrease;

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Byte getIsVip() {
        return isVip;
    }

    public void setIsVip(Byte isVip) {
        this.isVip = isVip;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getStorageUrl() {
        return storageUrl;
    }

    public void setStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl == null ? null : storageUrl.trim();
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

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime == null ? null : durationTime.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getSongAlbum() {
        return songAlbum;
    }

    public void setSongAlbum(Integer songAlbum) {
        this.songAlbum = songAlbum;
    }

    public Integer getSongKindIncrease() {
        return songKindIncrease;
    }

    public void setSongKindIncrease(Integer songKindIncrease) {
        this.songKindIncrease = songKindIncrease;
    }

    public Integer getSongCommentIncrease() {
        return songCommentIncrease;
    }

    public void setSongCommentIncrease(Integer songCommentIncrease) {
        this.songCommentIncrease = songCommentIncrease;
    }
}