package com.example.demo.mapper;

import com.example.demo.entity.Camerainfo;
import java.util.List;

public interface CamerainfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Camerainfo record);

    int insertSelective(Camerainfo record);

    Camerainfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Camerainfo record);

    int updateByPrimaryKey(Camerainfo record);

    Camerainfo find(Camerainfo record);

    List<Camerainfo> list(Camerainfo record);

    List<Camerainfo> pageList(Camerainfo record);
}