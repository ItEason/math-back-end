package com.iteason.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@RestController
@RequestMapping("/api")
public class AvatarController {

    // 注册用户上传头像接口
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, Model model) {
        // 判断图片是否为空
        if (file == null) {
            model.addAttribute("error", "请先上传图片！");
            return "false";
        }
        //判断图片是否合法
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.indexOf("."));
        if (!suffix.equals(".png") && !suffix.equals(".jpg") && !suffix.equals(".jpeg")) {
            model.addAttribute("error", "请上传png/jpg/jpeg格式的图片文件！");
            return "false";
        }
        //确定文件存放路径
        File dest = new File("E:/项目/Hope mathematics/math/src/assets/" + fileName);
        //存储文件
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            System.out.println("文件存储失败" + e.getMessage());
            throw new RuntimeException("文件存储失败，服务器异常", e);
        }
        // 返回最后的成功字符串
        return "true";
    }

}
