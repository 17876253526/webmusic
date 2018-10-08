package com.secondgroud.front.webmusic.service;

import com.secondgroud.front.webmusic.entity.Like;
import com.secondgroud.front.webmusic.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author
 * @Description
 * @project springboot_learn
 * @package com.dalaoyang.service
 * @email yangyang@dalaoyang.cn
 * @date 2018/4/18
 */
@Service
@Transactional
public class SongRedisService {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    public void set(String key, Object value) {
        //更改在redis里面查看key编码问题
        RedisSerializer redisSerializer =new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
    }

    public Object get(String key) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    /**
     *歌曲热度上升
     *  @param songId
     *
     */
    public void addLike(Integer songId) {
        Double songRank = redisTemplate.opsForZSet().incrementScore("songRank", songId, 1);
    }

    /**
     *歌曲排名
     *  @return
     */
    public Set<ZSetOperations.TypedTuple<Object>> likeNumeRank() {

        Set<ZSetOperations.TypedTuple<Object>> songRank = redisTemplate.opsForZSet().reverseRangeWithScores("songRank", 0, 100);

        return songRank;
    }




}
