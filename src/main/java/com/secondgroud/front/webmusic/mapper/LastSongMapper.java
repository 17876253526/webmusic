package mapper;

import entity.LastSong;

public interface LastSongMapper {
    int deleteByPrimaryKey(Integer lastSongId);

    int insert(LastSong record);

    int insertSelective(LastSong record);

    LastSong selectByPrimaryKey(Integer lastSongId);

    int updateByPrimaryKeySelective(LastSong record);

    int updateByPrimaryKey(LastSong record);
}