package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userinfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userinfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}