package com.qfedu.pojo;

public class Picture {
    private Integer id;

    private String imgurl;

    private Integer gid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", imgurl='" + imgurl + '\'' +
                ", gid=" + gid +
                '}';
    }
}