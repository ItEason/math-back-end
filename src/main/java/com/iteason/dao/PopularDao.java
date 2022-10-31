package com.iteason.dao;

import com.iteason.entity.Popular;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PopularDao {

    public List<Popular> getAllPopular();

    public void batchUpdate(String tID, Integer total);
}
