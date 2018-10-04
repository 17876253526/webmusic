package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer albumId);

    int insert(Album record);

    int insertSelective(Album record);

    Album selectByPrimaryKey(Integer albumId);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKeyWithBLOBs(Album record);

    int updateByPrimaryKey(Album record);
}