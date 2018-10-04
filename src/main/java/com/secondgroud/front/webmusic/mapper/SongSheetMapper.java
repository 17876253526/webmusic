package mapper;

import entity.SongSheet;

public interface SongSheetMapper {
    int deleteByPrimaryKey(Integer songSheetId);

    int insert(SongSheet record);

    int insertSelective(SongSheet record);

    SongSheet selectByPrimaryKey(Integer songSheetId);

    int updateByPrimaryKeySelective(SongSheet record);

    int updateByPrimaryKeyWithBLOBs(SongSheet record);

    int updateByPrimaryKey(SongSheet record);
}