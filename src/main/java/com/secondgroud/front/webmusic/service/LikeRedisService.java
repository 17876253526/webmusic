package com.secondgroud.front.webmusic.service;

import com.secondgroud.front.webmusic.utils.RedisUtil;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@Service
@Transactional
public class LikeRedisService {


    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Resource
    private JedisPool pool;

    /**
     * 点赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲Id、歌单Id、动态Id、歌曲评论Id、歌单评论Id、动态评论ID
     * @param   userId 点赞用户
     * @return
     */
    public void  like(String type,Integer firstId,Integer  secondId,Integer userId){

        /*获取点赞的key*/
        String s = RedisUtil.likeKey(type,firstId,secondId);

        Jedis jedis = null;

        setLike(userId, s, jedis);


    }

    /**
     * 点赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   userId 点赞用户
     * @return
     */
    public void  like(String type,Integer firstId,Integer userId){

        /*获取点赞的key*/
        String s = RedisUtil.likeKey(type,firstId);

        Jedis jedis = null;

        setLike(userId, s, jedis);

    }

    /**
     * 实现点赞
     * @param userId
     * @param s
     * @param jedis
     */
    private void setLike(Integer userId, String s, Jedis jedis) {
        try{
            jedis = pool.getResource();
            Boolean setbit = jedis.setbit(s, userId, String.valueOf(1));
        }finally{
            if(null != jedis)
                jedis.close(); // 释放资源还给连接池
        }
    }

    /**
     * 获取摸个评论的点赞数
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲评论Id、歌单评论Id、动态评论ID
     * @return
     */
    public Long likeCount(String type,Integer firstId,Integer secondId) {
        String s = RedisUtil.likeKey(type, firstId, secondId);

        Jedis jedis = null;

        Long bitcount = getLikeCount(s, jedis);

        return bitcount;

    }


    /**
     * 获取摸个评论的点赞数
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @return
     */
    public Long likeCount(String type,Integer firstId) {
        String s = RedisUtil.likeKey(type, firstId);

        Jedis jedis = null;
        Long bitcount=null;
        bitcount = getLikeCount(s, jedis);
        return bitcount;

    }

    /**
     * 获取点赞数实现
     * @param s
     * @param jedis
     * @return
     */
    private Long getLikeCount(String s, Jedis jedis) {
        Long bitcount;
        try {
            jedis = pool.getResource();
            bitcount = jedis.bitcount(s);
        }finally{
            if(null != jedis)
                jedis.close(); // 释放资源还给连接池
        }
        return bitcount;
    }


    /**
     * 获取当前是否点过赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   secondId    歌曲Id、歌单Id、动态Id、歌曲评论Id、歌单评论Id、动态评论ID
     * @param   userId 点赞用户
     * @return
     */
    public Boolean  getbit(String type,Integer firstId,Integer  secondId,Integer userId){
        String s = RedisUtil.likeKey(type, firstId, secondId);

        Jedis jedis = null;
        Boolean getbit = getBitExist(userId, s, jedis);
        return getbit;
    }


    /**
     * 获取当前是否点过赞
     * @param type  请使用传参LikeTypeLimit
     * @param  firstId  歌曲Id、歌单Id、动态Id
     * @param   userId 点赞用户
     * @return
     */
    public Boolean  getbit(String type,Integer firstId,Integer userId){
        String s = RedisUtil.likeKey(type, firstId);

        Jedis jedis = null;
        Boolean getbit=null;
        getbit = getBitExist(userId, s, jedis);
        return getbit;
    }

    /**
     * 当前是否点过赞是实现
     * @param userId
     * @param s
     * @param jedis
     * @return
     */
    private Boolean getBitExist(Integer userId, String s, Jedis jedis) {
        Boolean getbit;
        try {
            jedis = pool.getResource();

            getbit= jedis.getbit(s, userId);
        }finally{
            if(null != jedis)
                jedis.close(); // 释放资源还给连接池
        }
        return getbit;
    }


}
