package com.iteason.controller;

import com.iteason.entity.Popular;
import com.iteason.services.PopularService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PopularController {

    @Autowired
    public PopularService popularService;

    /* 获取最受欢迎教师接口 */
    @GetMapping("/popular")
    public List<Popular> getAllPopular() {
        return popularService.getAllPopular();
    }

    /* 更新最受欢迎老师接口 */
    @GetMapping("/likes")
    public String batchUpdate(@Param("tID") String tID, @Param("total") Integer total) {
        popularService.batchUpdate(tID, total);
        return "ok";
    }


}
