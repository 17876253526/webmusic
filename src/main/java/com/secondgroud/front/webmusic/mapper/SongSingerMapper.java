package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.SongSinger;

public interface SongSingerMapper {
    int deleteByPrimaryKey(Integer songSingerId);

    int insert(SongSinger record);

    int insertSelective(SongSinger record);

    SongSinger selectByPrimaryKey(Integer songSingerId);

    int updateByPrimaryKeySelective(SongSinger record);

    int updateByPrimaryKey(SongSinger record);
}