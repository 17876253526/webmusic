package mapper;

import entity.CommentIncrease;

public interface CommentIncreaseMapper {
    int deleteByPrimaryKey(Integer commentIncreaseId);

    int insert(CommentIncrease record);

    int insertSelective(CommentIncrease record);
}