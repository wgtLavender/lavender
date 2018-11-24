package com.qfedu.service;


import com.qfedu.pojo.Goods;
import com.qfedu.pojo.RespouseVo;

public interface GoodsService {
    RespouseVo showGoods(Integer pageNum, Integer pageSize);
    boolean delGood(Integer id);
    boolean delGoods(String[] id);
    boolean addGood(Goods goods);
}
