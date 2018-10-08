package com.secondgroud.front.webmusic.utils;

public class RedisUtil {


    public static String getFocusMeKey(Integer toId) {

        return "focus:focusMe:" + toId;

    }

    public static String getMyFocusKey(Integer userId){
        return "focus:myFocus:" + userId;
    }

    public static String likeKey(String type, Integer id, Integer commentId){
         return "like:"+type+":"+id+":"+commentId;
    }

    public static String likeKey(String type, Integer id){
        return "like:"+type+":"+id+":"+id;
    }
}
