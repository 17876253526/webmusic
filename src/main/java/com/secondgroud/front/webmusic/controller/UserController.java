package com.secondgroud.front.webmusic.controller;

import com.secondgroud.front.webmusic.entity.Song;
import com.secondgroud.front.webmusic.service.SongRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private SongRedisService redisService;

    @GetMapping("save")
    public  String save() {
        Song song = new Song();
        song.setSongId(1);
        song.setName("不染");
        redisService.set(song.getSongId()+"",song);
        Song song2 = new Song();
        song2.setSongId(2);
        song2.setName("红尘");
        redisService.set(song2.getSongId()+"",song);
        return "success";
    }

    @GetMapping("get")
    public Song get() {
        Song song=(Song)redisService.get(1+"");
        return song;
    }
}
