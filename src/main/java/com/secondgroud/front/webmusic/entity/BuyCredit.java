package entity;

import java.util.Date;

public class BuyCredit {
    private Integer buyCreditId;

    private Integer buyCreditUser;

    private Integer num;

    private Date buyTime;

    public Integer getBuyCreditId() {
        return buyCreditId;
    }

    public void setBuyCreditId(Integer buyCreditId) {
        this.buyCreditId = buyCreditId;
    }

    public Integer getBuyCreditUser() {
        return buyCreditUser;
    }

    public void setBuyCreditUser(Integer buyCreditUser) {
        this.buyCreditUser = buyCreditUser;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
}