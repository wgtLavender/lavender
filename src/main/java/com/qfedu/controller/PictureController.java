package com.qfedu.controller;

import com.qfedu.pojo.RespouseVo;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.SortedMap;
import java.util.UUID;

/**
 * @program: IDEA
 * @author: Administrator
 * @create: 2018-11-19 22:28
 **/
@Controller
@RequestMapping("/api/v1/")
public class PictureController {
    @Autowired
    private PictureService service;
    @RequestMapping(path = "pictureInsert",method = RequestMethod.POST)
    @ResponseBody
    public RespouseVo pictures(MultipartFile[] file) throws IOException {
        System.out.println(file);
        RespouseVo<String> vo = new RespouseVo();
        vo.setCode(1000);
        for (MultipartFile multipartFile : file) {
            String s = UUID.randomUUID().toString().replace("-", "").substring(0, 8) + multipartFile.getOriginalFilename();
            File file1 = new File("D:\\stuupload\\" + s);
            multipartFile.transferTo(file1);
            vo.setImgurl(s);
        }
        return vo;
    }
}

