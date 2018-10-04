package entity;

public class UserInfo {
    private Integer userinfoId;

    private Integer totalIntegral;

    private Byte isVip;

    private Integer userinfoUser;

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getTotalIntegral() {
        return totalIntegral;
    }

    public void setTotalIntegral(Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    public Byte getIsVip() {
        return isVip;
    }

    public void setIsVip(Byte isVip) {
        this.isVip = isVip;
    }

    public Integer getUserinfoUser() {
        return userinfoUser;
    }

    public void setUserinfoUser(Integer userinfoUser) {
        this.userinfoUser = userinfoUser;
    }
}