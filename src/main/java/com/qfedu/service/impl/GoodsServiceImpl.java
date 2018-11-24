package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.mapper.GoodsMapper;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.RespouseVo;
import com.qfedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: IDEA
 * @author: Mr.Wang
 * @create: 2018-11-18 19:19
 **/
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper mapper;

    public RespouseVo showGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goods = mapper.selectAll();
        RespouseVo vo = new RespouseVo();
        vo.setData(goods);
        vo.setCode(1000);
        return vo;
    }

    public boolean delGood(Integer id) {
        return mapper.deleteByPrimaryKey(id)==0?false:true;


    }

    public boolean delGoods(String[] id) {
        return mapper.deleteGoods(id)==0?false:true;
    }

    public boolean addGood(Goods goods) {

        return mapper.insertSelective(goods)==0?false:true;
    }
}

