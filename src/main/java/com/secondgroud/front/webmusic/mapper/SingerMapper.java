package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Singer;

public interface SingerMapper {
    int deleteByPrimaryKey(Integer singId);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer singId);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKeyWithBLOBs(Singer record);

    int updateByPrimaryKey(Singer record);
}