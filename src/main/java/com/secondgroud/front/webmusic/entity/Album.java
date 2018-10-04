package entity;

import java.util.Date;

public class Album {
    private Integer albumId;

    private String name;

    private Date time;

    private Long collectNum;

    private String image;

    private Integer albumSinger;

    private Integer albumCommentIncrease;

    private String introduction;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Long collectNum) {
        this.collectNum = collectNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getAlbumSinger() {
        return albumSinger;
    }

    public void setAlbumSinger(Integer albumSinger) {
        this.albumSinger = albumSinger;
    }

    public Integer getAlbumCommentIncrease() {
        return albumCommentIncrease;
    }

    public void setAlbumCommentIncrease(Integer albumCommentIncrease) {
        this.albumCommentIncrease = albumCommentIncrease;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}