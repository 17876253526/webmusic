package entity;

public class Price {
    private Integer priceid;

    private Double intergralPrice;

    private Double vipPrice;

    public Integer getPriceid() {
        return priceid;
    }

    public void setPriceid(Integer priceid) {
        this.priceid = priceid;
    }

    public Double getIntergralPrice() {
        return intergralPrice;
    }

    public void setIntergralPrice(Double intergralPrice) {
        this.intergralPrice = intergralPrice;
    }

    public Double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }
}