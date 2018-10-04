package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.KindIncrease;

public interface KindIncreaseMapper {
    int deleteByPrimaryKey(Integer kindIncreaseId);

    int insert(KindIncrease record);

    int insertSelective(KindIncrease record);
}