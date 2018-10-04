package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.DynamicPic;

public interface DynamicPicMapper {
    int deleteByPrimaryKey(Integer dynamicPicId);

    int insert(DynamicPic record);

    int insertSelective(DynamicPic record);

    DynamicPic selectByPrimaryKey(Integer dynamicPicId);

    int updateByPrimaryKeySelective(DynamicPic record);

    int updateByPrimaryKey(DynamicPic record);
}