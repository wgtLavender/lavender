package com.qfedu.mapper;

import com.qfedu.pojo.Picture;

import java.util.List;

public interface PictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
    int inserts(List<Picture> pictures);
}