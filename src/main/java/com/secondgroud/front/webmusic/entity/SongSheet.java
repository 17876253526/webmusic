package entity;

import java.util.Date;

public class SongSheet {
    private Integer songSheetId;

    private String sheetName;

    private Date createtime;

    private Byte isPrivate;

    private Long playback;

    private Long share;

    private Long collection;

    private String picUrl;

    private Integer songSheetUser;

    private Integer songSheetKingIncrease;

    private Integer songSheetCommentIncrease;

    private String note;

    public Integer getSongSheetId() {
        return songSheetId;
    }

    public void setSongSheetId(Integer songSheetId) {
        this.songSheetId = songSheetId;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName == null ? null : sheetName.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Byte isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Long getPlayback() {
        return playback;
    }

    public void setPlayback(Long playback) {
        this.playback = playback;
    }

    public Long getShare() {
        return share;
    }

    public void setShare(Long share) {
        this.share = share;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getSongSheetUser() {
        return songSheetUser;
    }

    public void setSongSheetUser(Integer songSheetUser) {
        this.songSheetUser = songSheetUser;
    }

    public Integer getSongSheetKingIncrease() {
        return songSheetKingIncrease;
    }

    public void setSongSheetKingIncrease(Integer songSheetKingIncrease) {
        this.songSheetKingIncrease = songSheetKingIncrease;
    }

    public Integer getSongSheetCommentIncrease() {
        return songSheetCommentIncrease;
    }

    public void setSongSheetCommentIncrease(Integer songSheetCommentIncrease) {
        this.songSheetCommentIncrease = songSheetCommentIncrease;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}