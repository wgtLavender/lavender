package com.qfedu.controller;

import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Picture;
import com.qfedu.pojo.RespouseVo;
import com.qfedu.service.GoodsService;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@Controller
@RequestMapping("/api/v1/")
public class GoodsController {
    @Autowired
    private GoodsService service;
    @Autowired
    private PictureService pservice;
    @RequestMapping(path = "showGoods",method = RequestMethod.GET)
    @ResponseBody
    public RespouseVo showGoods(Integer pageNum, Integer pageSize, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET");
        return service.showGoods(pageNum, pageSize);
    }
    @RequestMapping(path = "deleteById",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean delGood(Integer id) {
        return service.delGood(id);
    }
    @RequestMapping(path = "goodsDele",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean goodsDele(@RequestParam("id") String[] id) {
        System.out.println(id);
        for (String s : id) {
            System.out.println(s);
        }
        return  service.delGoods(id);
    }
    @RequestMapping(path = "goodsInsert",method = RequestMethod.POST)
    @ResponseBody
    public boolean addGood(Goods goods, HttpServletRequest request) {
        System.out.println(goods);
        ArrayList<Picture> list = new ArrayList<Picture>();
        Picture picture = new Picture();
        boolean b = service.addGood(goods);
        String[] values = request.getParameterValues("filename");
        if (b && values !=null) {
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                System.out.println(value);
                picture.setImgurl(value);
                picture.setGid(goods.getId());
                System.out.println(picture);
                list.add(picture);
                System.out.println(list);
            }

            pservice.addPicture(list);
        }
        return b;
    }
}

