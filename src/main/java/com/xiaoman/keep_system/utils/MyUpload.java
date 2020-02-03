package com.xiaoman.keep_system.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//@ConfigurationProperties("upload.config")
public class MyUpload {

    public static final String FILE_PATH = "D:\\work\\workspace\\vue-keep\\static\\img\\";
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @methodDesc: 图片上传
     * @Param: MultipartFile
     * @Author: Joe
     * @Date 2019-12-30-00-32
     */
    public static List<String> pictureUpload(MultipartFile[] pictures) throws IOException {
        List<String> finalPaths = new ArrayList<>();
        for (MultipartFile picture : pictures) {
            if (picture.isEmpty()){
                return finalPaths;
            }
            //图片新名字
            String newName = UUID.randomUUID().toString();
            //图片原来的名字
            String oldName = picture.getOriginalFilename();
            //后缀
            String sux = oldName.substring(oldName.lastIndexOf("."));
            //新建本地文件流
            File file = new File(FILE_PATH+newName+sux);
            //写入本地磁盘
            picture.transferTo(file);
            String filePath = file.getCanonicalPath();
//        String picPath = filePath.substring(filePath.indexOf("t")+1);
//            String finalPath = "."+filePath.substring(26);
            String finalPath = filePath.substring(26);
            finalPaths.add(finalPath);
        }
        return finalPaths;
    }

    public static void main(String[] args){
        String file = "D:\\work\\workspace\\vue-keep\\static\\img\\";
        String picPath = file.substring(file.indexOf("g")+1);
        String finalPath = "."+file.substring(26);
        System.out.println(finalPath);
    }
}
