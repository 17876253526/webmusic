package mapper;

import entity.KindIncrease;

public interface KindIncreaseMapper {
    int deleteByPrimaryKey(Integer kindIncreaseId);

    int insert(KindIncrease record);

    int insertSelective(KindIncrease record);
}