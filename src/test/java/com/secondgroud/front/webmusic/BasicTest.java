package com.secondgroud.front.webmusic;

import com.secondgroud.front.webmusic.entity.User;
import com.secondgroud.front.webmusic.mapper.UserMapper;
import com.secondgroud.front.webmusic.service.FocusRedisService;
import com.secondgroud.front.webmusic.service.SongRedisService;
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

}
