package mapper;

import entity.LikeIncrease;

public interface LikeIncreaseMapper {
    int deleteByPrimaryKey(Integer likeIncreaseId);

    int insert(LikeIncrease record);

    int insertSelective(LikeIncrease record);
}