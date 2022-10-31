package com.iteason.services;

import com.iteason.dao.PageDao;
import com.iteason.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    @Autowired
    public PageDao pageDao;

    public List<Page> getPages() {
        return pageDao.getPages();
    }

    public int getMaxPage() {
        return pageDao.getMaxPage();
    }

    public int updatePage(int id) {
        return pageDao.updatePage(id);
    }

    public List<Page> searchPages(String grade, String type, String other) {
        return pageDao.searchPages(grade, type, other);
    }
}
