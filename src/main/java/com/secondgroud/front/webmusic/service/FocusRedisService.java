package com.secondgroud.front.webmusic.service;


import com.secondgroud.front.webmusic.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Set;

@Service
@Transactional
public class FocusRedisService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;


    /**
     * 查找关注我的用户
     * @param userId 用户Id
     * @return 关注我的用户集合
     */
    public Set<Object> focusMeList(Integer userId){

        String focuskey=RedisUtil.getFocusMeKey(userId);


        Set<Object> members =redisTemplate.opsForSet().members(focuskey);

        return  members;
    }

    /**
     * 关注
     * @param fromId 发起关注的用户
     * @param toId 被关注用户
     * @return
     */
    public boolean focus(Integer fromId,Integer toId) {
        String focusMeKey=RedisUtil.getFocusMeKey(toId);
        String myFocusKey = RedisUtil.getMyFocusKey(fromId);

        redisTemplate.opsForSet().add(focusMeKey, fromId);
        redisTemplate.opsForSet().add(myFocusKey, toId);

        return true;
    }


    /**
     * 取消关注
     * @param fromId 发起关注的用户
     * @param toId  被关注用户
     * @return
     */
    public boolean unfocus(Integer fromId,Integer toId) {

        String focusMeKey=RedisUtil.getFocusMeKey(toId);
        String myFocusKey = RedisUtil.getMyFocusKey(fromId);

        redisTemplate.opsForSet().remove(focusMeKey, fromId);
        redisTemplate.opsForSet().remove(myFocusKey, toId);

        return true;
    }

    /**
     * 查找我关注的用户
     * @param userId 用户ID
     * @return 关注的用户集合
     */
    public Set<Object> myFocusList(Integer userId){

        String myFocusKey=RedisUtil.getMyFocusKey(userId);

        Set<Object> members =redisTemplate.opsForSet().members(myFocusKey);

        return  members;
    }


}
