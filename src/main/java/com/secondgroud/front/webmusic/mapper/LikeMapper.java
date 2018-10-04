package mapper;

import entity.Like;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer commentLikeId);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(Integer commentLikeId);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}