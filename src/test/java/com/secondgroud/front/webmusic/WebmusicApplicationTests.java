package com.secondgroud.front.webmusic;

import com.alibaba.fastjson.JSONObject;
import com.secondgroud.front.webmusic.entity.Song;
import com.secondgroud.front.webmusic.utils.ElasticsearchUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebmusicApplicationTests {


    @Test
    public void contextLoads() {
    }

    @Test
    public void insertData(){

        Song song = new Song();
        song.setSongId(2);
        song.setName("大型打脸现场");


        JSONObject bookJson = (JSONObject) JSONObject.toJSON(song);

        String s = ElasticsearchUtils.addData( bookJson, "ymq_index", "book", song.getSongId().toString());

        System.out.println(s);
    }
}
