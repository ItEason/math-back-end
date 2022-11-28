package com.iteason.controller;


import com.iteason.entity.Course;
import com.iteason.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/getCourse")
    public List<Course> getCourse() {
        return courseService.getCourse();
    }

    ;

    @GetMapping("/getMaxCourse")
    public int getMaxPage() {
        int total = courseService.getMaxCourse();
        int result = 0;
        if (total % 10 == 0) {
            result = total / 10;
        } else {
            result = total / 10 + 1;
        }
        return result;
    }

    @GetMapping("/searchCourse")
    public List<Course> searchCourse(@RequestParam("params") String params) {
        List<Course> result = null;

        result = courseService.searchCourse(params);

        return result;
    }

    @GetMapping("/getCourseById")
    public List<Course> getCourseById(@RequestParam("id") int id) {
        List<Course> result = null;

        result = courseService.getCourseById(id);

        return result;
    }

    static String courseName;

    @GetMapping("/addCourse")
    public int addCourse(@RequestParam("cname") String cname, @RequestParam("tname") String tname, @RequestParam("contents") String contents, @RequestParam("cover") String cover) {
        courseName = cname;
        return courseService.addCourse(cname, tname, contents, cover);
    }

    static String newVideoName;

    //实现接收的方法
    @CrossOrigin
    @PostMapping(value = "/uploadVideo")
    @ResponseBody
    public Map<String, String> savaVideo(@RequestParam("file") MultipartFile file, @RequestParam String SavePath)
            throws IllegalStateException {
        Map<String, String> resultMap = new HashMap<>();
        try {
            //获取文件后缀，因此此后端代码可接收一切文件，上传格式前端限定
            String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1)
                    .toLowerCase();
            // 重构文件名称
            System.out.println("前端传递的保存路径：" + SavePath);
            String pikId = UUID.randomUUID().toString().replaceAll("-", "");
            newVideoName = pikId + "." + fileExt;
            System.out.println("重构文件名防止上传同名文件：" + newVideoName);
            //保存视频
            File fileSave = new File(SavePath, newVideoName);
            file.transferTo(fileSave);
            //构造Map将视频信息返回给前端
            //视频名称重构后的名称
            resultMap.put("newVideoName", newVideoName);
            //正确保存视频则设置返回码为200
            resultMap.put("resCode", "200");
            //返回视频保存路径
            resultMap.put("VideoUrl", SavePath + "/" + newVideoName);
            // 执行更新url语句
            int index = newVideoName.indexOf(".");
            newVideoName = newVideoName.substring(0, index);
            courseService.updateUrl(newVideoName, courseName);
            return resultMap;

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            //保存视频错误则设置返回码为400
            resultMap.put("resCode", "400");
            return resultMap;
        }
    }

    @GetMapping("/updateClick")
    public int updateClick(@RequestParam("cid") int cid) {
        return courseService.updateClick(cid);
    }
}
