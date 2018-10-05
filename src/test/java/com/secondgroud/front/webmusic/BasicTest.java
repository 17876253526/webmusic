package com.secondgroud.front.webmusic;

import com.secondgroud.front.webmusic.entity.User;
import com.secondgroud.front.webmusic.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Autowired
    UserMapper userMapper;

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
}
