package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Kind;

public interface KindMapper {
    int deleteByPrimaryKey(Integer kindId);

    int insert(Kind record);

    int insertSelective(Kind record);

    Kind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}