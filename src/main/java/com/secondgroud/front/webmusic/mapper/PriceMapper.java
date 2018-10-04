package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.Price;

public interface PriceMapper {
    int deleteByPrimaryKey(Integer priceid);

    int insert(Price record);

    int insertSelective(Price record);

    Price selectByPrimaryKey(Integer priceid);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);
}