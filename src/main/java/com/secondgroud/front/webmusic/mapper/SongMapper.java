package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Song;
import com.secondgroud.front.webmusic.entity.SongWithBLOBs;

public interface SongMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(SongWithBLOBs record);

    int insertSelective(SongWithBLOBs record);

    SongWithBLOBs selectByPrimaryKey(Integer songId);

    int updateByPrimaryKeySelective(SongWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SongWithBLOBs record);

    int updateByPrimaryKey(Song record);
}