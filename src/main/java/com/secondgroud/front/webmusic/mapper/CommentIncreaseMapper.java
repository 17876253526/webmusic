package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.CommentIncrease;

public interface CommentIncreaseMapper {
    int deleteByPrimaryKey(Integer commentIncreaseId);

    int insert(CommentIncrease record);

    int insertSelective(CommentIncrease record);
}