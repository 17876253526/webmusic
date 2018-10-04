package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Dynamic;

public interface DynamicMapper {
    int deleteByPrimaryKey(Integer dynamicId);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    Dynamic selectByPrimaryKey(Integer dynamicId);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}