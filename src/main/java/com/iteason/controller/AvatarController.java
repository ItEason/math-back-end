package com.iteason.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


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

        String[] chars = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int j = 0; j < 8; j++) {
            String str = uuid.substring(j * 4, j * 4 + 4);
            int par = Integer.parseInt(str, 16);
            shortBuffer.append(chars[par % 36]);
        }
        String s = shortBuffer.toString();

        String file_name = s + suffix;
        //确定文件存放路径
        File dest = new File("/project/math/dist/img/" + file_name);

        //存储文件
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            System.out.println("文件存储失败" + e.getMessage());
            throw new RuntimeException("文件存储失败，服务器异常", e);
        }
        // 返回最后的成功字符串
        return file_name;
    }


}
