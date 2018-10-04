package mapper;

import entity.BaseKind;

public interface BaseKindMapper {
    int deleteByPrimaryKey(Integer baseKindId);

    int insert(BaseKind record);

    int insertSelective(BaseKind record);

    BaseKind selectByPrimaryKey(Integer baseKindId);

    int updateByPrimaryKeySelective(BaseKind record);

    int updateByPrimaryKey(BaseKind record);
}