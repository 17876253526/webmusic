package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Mv;

public interface MvMapper {
    int deleteByPrimaryKey(Integer mvId);

    int insert(Mv record);

    int insertSelective(Mv record);

    Mv selectByPrimaryKey(Integer mvId);

    int updateByPrimaryKeySelective(Mv record);

    int updateByPrimaryKey(Mv record);
}