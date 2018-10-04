package com.secondgroud.front.webmusic.entity;

public class DynamicPic {
    private Integer dynamicPicId;

    private String dynamicImgUrl;

    private Integer dynamicPicDynamic;

    public Integer getDynamicPicId() {
        return dynamicPicId;
    }

    public void setDynamicPicId(Integer dynamicPicId) {
        this.dynamicPicId = dynamicPicId;
    }

    public String getDynamicImgUrl() {
        return dynamicImgUrl;
    }

    public void setDynamicImgUrl(String dynamicImgUrl) {
        this.dynamicImgUrl = dynamicImgUrl == null ? null : dynamicImgUrl.trim();
    }

    public Integer getDynamicPicDynamic() {
        return dynamicPicDynamic;
    }

    public void setDynamicPicDynamic(Integer dynamicPicDynamic) {
        this.dynamicPicDynamic = dynamicPicDynamic;
    }
}