package com.iteason.controller;

import com.iteason.entity.Page;
import com.iteason.services.PageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PageController {

    @Autowired
    public PageService pageService;

    // 通过分页查询获取examination数据接口
    @GetMapping("/getPages")
    public List<Page> getPages() {
        return pageService.getPages();
    }

    // 获取examination数据页数接口
    @GetMapping("/getMaxPage")
    public int getMaxPage() {
        int total = pageService.getMaxPage();
        int result = 0;
        if (total % 6 == 0) {
            result = total / 6;
        } else {
            result = total / 6 + 1;
        }
        return result;
    }

    @GetMapping("/updatePage")
    public int updatePage(@RequestParam("id") int id) {
        return pageService.updatePage(id);
    }

    @GetMapping("/searchPages")
    public List<Page> searchPages(@RequestParam("grade") String grade, @RequestParam("type") String type, @RequestParam("other") String other) {
        return pageService.searchPages(grade, type, other);
    }
}
