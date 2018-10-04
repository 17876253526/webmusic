package mapper;

import entity.BuySongs;

public interface BuySongsMapper {
    int deleteByPrimaryKey(Integer buySongsId);

    int insert(BuySongs record);

    int insertSelective(BuySongs record);

    BuySongs selectByPrimaryKey(Integer buySongsId);

    int updateByPrimaryKeySelective(BuySongs record);

    int updateByPrimaryKey(BuySongs record);
}