package com.iteason.dao;

import com.iteason.entity.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageDao {

    /* 当页面初始化时调用的方法 */
    public List<Page> getPages();

    public int getMaxPage();

    public int updatePage(int id);

    public List<Page> searchPages(String grade, String type, String other);
}
