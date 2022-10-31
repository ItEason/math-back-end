package com.iteason.services;

import com.iteason.dao.PopularDao;
import com.iteason.entity.Popular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularService {

    @Autowired
    public PopularDao popularDao;

    public List<Popular> getAllPopular() {
        return popularDao.getAllPopular();
    }

    public void batchUpdate(String tID, Integer total) {
        popularDao.batchUpdate(tID, total);
    }
}
