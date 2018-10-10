package com.secondgroud.front.webmusic.service;



public interface LikeRedisService {
    /**
     * 点赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲评论Id、歌单评论Id、动态评论ID
     * @param   userId 点赞用户
     * @return
     */

    void  like(String type, Integer firstId, Integer secondId, Integer userId);

    /**
     * 点赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   userId 点赞用户
     * @return
     */

    void  like(String type, Integer firstId, Integer userId);

    /**
     * 获取摸个评论的点赞数
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲评论Id、歌单评论Id、动态评论ID
     * @return
     */

    Long likeCount(String type, Integer firstId, Integer secondId);

    /**
     * 获取摸个评论的点赞数
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @return
     */

    Long likeCount(String type, Integer firstId);

    /**
     * 获取当前是否点过赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲评论Id、歌单评论Id、动态评论ID
     * @param   userId 点赞用户
     * @return
     */

    Boolean  getbit(String type, Integer firstId, Integer secondId, Integer userId);

    /**
     * 获取当前是否点过赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   userId 点赞用户
     * @return
     */

    Boolean  getbit(String type, Integer firstId, Integer userId);
}
