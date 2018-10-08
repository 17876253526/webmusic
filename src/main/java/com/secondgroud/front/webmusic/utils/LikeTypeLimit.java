package com.secondgroud.front.webmusic.utils;

public class LikeTypeLimit {


    /**
     * 歌曲
     */
    private static final String song = "SONG";

    /**
     * 歌单
     */
    private static final String songSheet = "SONGSHEET";


    /**
     * 动态
     */
    private static final String dynamic="DYNAMIC";

    /**
     * 歌曲的评论
     */
    private static final String songComment = "SONGCOMMENT";

    /**
     * 歌单的评论
     */
    private static final String songSheetComment = "SONGSHEETCOMMENT";


    /**
     * 动态的评论
     */
    private  static final String  dynamicComment="DYNAMICCOMMENT";

    public static String getSong() {
        return song;
    }

    public static String getSongSheet() {
        return songSheet;
    }

    public static String getDynamic() {
        return dynamic;
    }

    public static String getSongComment() {
        return songComment;
    }

    public static String getSongSheetComment() {
        return songSheetComment;
    }

    public static String getDynamicComment() {
        return dynamicComment;
    }
}
