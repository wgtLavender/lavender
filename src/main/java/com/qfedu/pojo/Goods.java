package com.qfedu.pojo;

public class Goods {
    private Integer id;

    private String goodname;

    private Integer pid;

    private Integer price;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodname='" + goodname + '\'' +
                ", pid=" + pid +
                ", price=" + price +
                ", type=" + type +
                '}';


    }
}