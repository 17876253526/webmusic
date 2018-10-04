package mapper;

import entity.Focus;

public interface FocusMapper {
    int deleteByPrimaryKey(Integer focusId);

    int insert(Focus record);

    int insertSelective(Focus record);

    Focus selectByPrimaryKey(Integer focusId);

    int updateByPrimaryKeySelective(Focus record);

    int updateByPrimaryKey(Focus record);
}