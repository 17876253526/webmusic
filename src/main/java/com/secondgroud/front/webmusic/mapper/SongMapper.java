package mapper;

import entity.Song;
import entity.SongWithBLOBs;

public interface SongMapper {
    int deleteByPrimaryKey(Integer songId);

    int insert(SongWithBLOBs record);

    int insertSelective(SongWithBLOBs record);

    SongWithBLOBs selectByPrimaryKey(Integer songId);

    int updateByPrimaryKeySelective(SongWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SongWithBLOBs record);

    int updateByPrimaryKey(Song record);
}