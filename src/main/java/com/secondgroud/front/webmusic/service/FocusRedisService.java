package com.secondgroud.front.webmusic.service;



import java.util.Set;


public interface FocusRedisService {


    /**
     * 查找关注我的用户
     * @param userId 用户Id
     * @return 关注我的用户集合
     */
    public Set<Object> focusMeList(Integer userId);

    /**
     * 关注
     * @param fromId 发起关注的用户
     * @param toId 被关注用户
     * @return
     */
    public boolean focus(Integer fromId,Integer toId);


    /**
     * 取消关注
     * @param fromId 发起关注的用户
     * @param toId  被关注用户
     * @return
     */
    public boolean unfocus(Integer fromId,Integer toId);


    /**
     * 查找我关注的用户
     * @param userId 用户ID
     * @return 关注的用户集合
     */
    public Set<Object> myFocusList(Integer userId);

}
