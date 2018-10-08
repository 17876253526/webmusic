package com.secondgroud.front.webmusic;

import com.secondgroud.front.webmusic.entity.Like;
import com.secondgroud.front.webmusic.entity.User;
import com.secondgroud.front.webmusic.mapper.UserMapper;
import com.secondgroud.front.webmusic.service.FocusRedisService;
import com.secondgroud.front.webmusic.service.LikeRedisService;
import com.secondgroud.front.webmusic.service.SongRedisService;
import com.secondgroud.front.webmusic.utils.LikeTypeLimit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    FocusRedisService redisService;

    @Autowired
    LikeRedisService likeRedisService;


    //测试数据库连接
    @Test
    public void testjdbcContect(){
        try {
            User user = userMapper.selectByPrimaryKey(1);
            System.out.println(user);
            System.out.println("数据库连接成功");
        }catch (Exception e){
            System.out.println("数据库连接失败（检查application.xml数据源的url,username,password以及端口）");
        }
    }

    @Test
    public void testFocus() {
        redisService.focus(1, 2);
        redisService.focus(1, 3);
        redisService.focus(1, 4);
        redisService.focus(2, 4);
        redisService.focus(3, 4);
        Set<Object> objects = redisService.focusMeList(4);
        Set<Object> objects2 = redisService.myFocusList(1);
        System.out.println(objects);
    }

    @Test
    public void TestLike() {
        /*给歌曲Id为1点赞，*/
       likeRedisService.like(LikeTypeLimit.getSong(),1,1);
       likeRedisService.like(LikeTypeLimit.getSong(),1,2);
       likeRedisService.like(LikeTypeLimit.getSong(),1,3);
        /*给歌曲Id为1下的评论id为1的评论点赞,fristId是歌曲ID,secondId是评论Id*/
        likeRedisService.like(LikeTypeLimit.getSongComment(),1,1,1);
        likeRedisService.like(LikeTypeLimit.getSongComment(),1,1,2);
        likeRedisService.like(LikeTypeLimit.getSongComment(),1,1,3);
        /*给歌曲Id为1下的评论id为2、3的评论点赞,fristId是歌曲ID,secondId是评论Id*/
        likeRedisService.like(LikeTypeLimit.getSongComment(),1,2,1);
        likeRedisService.like(LikeTypeLimit.getSongComment(),1,3,1);


        /*动态点赞*/
        likeRedisService.like(LikeTypeLimit.getDynamic(),1,1);
        likeRedisService.like(LikeTypeLimit.getDynamic(),1,2);
        likeRedisService.like(LikeTypeLimit.getDynamic(),1,3);

    }



}
