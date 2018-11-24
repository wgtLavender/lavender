package com.qfedu.service.impl;

import com.qfedu.mapper.PictureMapper;
import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/** 
* @Author: Administrator
* @Description: 
* @Param:  
* @Return:  
* @Date: 22:13 2018/11/19 
*/ 
@Service
@Transactional
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureMapper mapper;
    public boolean addPicture(List<Picture> pictures) {
        return mapper.inserts(pictures)==0?false:true;


    }
}

