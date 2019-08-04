package com.learn.feignuploadserver.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @author Jerry
 * @Date 2019-08-02 08:00
 */
@RestController
public class UploadController {

    @PostMapping(value = "/fileUploadHandle", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void fileUploadHandle(MultipartFile multipartFile) {
        System.out.println(multipartFile.getName());
    }
}
