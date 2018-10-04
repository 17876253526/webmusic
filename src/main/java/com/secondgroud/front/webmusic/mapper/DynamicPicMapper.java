package mapper;

import entity.DynamicPic;

public interface DynamicPicMapper {
    int deleteByPrimaryKey(Integer dynamicPicId);

    int insert(DynamicPic record);

    int insertSelective(DynamicPic record);

    DynamicPic selectByPrimaryKey(Integer dynamicPicId);

    int updateByPrimaryKeySelective(DynamicPic record);

    int updateByPrimaryKey(DynamicPic record);
}