package mapper;

import entity.Chats;

public interface ChatsMapper {
    int deleteByPrimaryKey(Integer chatsId);

    int insert(Chats record);

    int insertSelective(Chats record);

    Chats selectByPrimaryKey(Integer chatsId);

    int updateByPrimaryKeySelective(Chats record);

    int updateByPrimaryKey(Chats record);
}