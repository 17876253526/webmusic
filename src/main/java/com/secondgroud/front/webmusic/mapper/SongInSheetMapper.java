package com.secondgroud.front.webmusic.mapper;

import com.secondgroud.front.webmusic.entity.SongInSheet;

public interface SongInSheetMapper {
    int deleteByPrimaryKey(Integer songInSheetId);

    int insert(SongInSheet record);

    int insertSelective(SongInSheet record);

    SongInSheet selectByPrimaryKey(Integer songInSheetId);

    int updateByPrimaryKeySelective(SongInSheet record);

    int updateByPrimaryKey(SongInSheet record);
}