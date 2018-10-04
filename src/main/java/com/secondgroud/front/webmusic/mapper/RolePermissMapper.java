package mapper;

import entity.RolePermiss;

public interface RolePermissMapper {
    int deleteByPrimaryKey(Integer rolePermissId);

    int insert(RolePermiss record);

    int insertSelective(RolePermiss record);

    RolePermiss selectByPrimaryKey(Integer rolePermissId);

    int updateByPrimaryKeySelective(RolePermiss record);

    int updateByPrimaryKey(RolePermiss record);
}