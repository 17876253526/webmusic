package com.secondgroud.front.webmusic.service;

import org.springframework.data.redis.core.ZSetOperations;


import java.util.Set;


public interface SongRedisService {

    /**
     *歌曲热度上升
     *  @param songId
     *
     */
    public void addLike(Integer songId);

    /**
     *歌曲排名
     *  @return
     */
    public Set<ZSetOperations.TypedTuple<Object>> likeNumeRank();

}
