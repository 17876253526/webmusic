package mapper;

import entity.BuyCredit;

public interface BuyCreditMapper {
    int deleteByPrimaryKey(Integer buyCreditId);

    int insert(BuyCredit record);

    int insertSelective(BuyCredit record);

    BuyCredit selectByPrimaryKey(Integer buyCreditId);

    int updateByPrimaryKeySelective(BuyCredit record);

    int updateByPrimaryKey(BuyCredit record);
}