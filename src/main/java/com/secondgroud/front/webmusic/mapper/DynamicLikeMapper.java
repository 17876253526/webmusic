package mapper;

import entity.DynamicLike;

public interface DynamicLikeMapper {
    int deleteByPrimaryKey(Integer dynamicLikeId);

    int insert(DynamicLike record);

    int insertSelective(DynamicLike record);

    DynamicLike selectByPrimaryKey(Integer dynamicLikeId);

    int updateByPrimaryKeySelective(DynamicLike record);

    int updateByPrimaryKey(DynamicLike record);
}