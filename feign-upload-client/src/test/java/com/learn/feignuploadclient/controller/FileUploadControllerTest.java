package com.learn.feignuploadclient.controller;

import com.learn.feignuploadclient.service.FileUploadService;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.http.entity.ContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

/**
 * @author Jerry
 * @Date 2019-08-02 09:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FileUploadControllerTest {
    @Autowired
    private FileUploadService fileUploadService;

    @Test
    public void fileUpload() throws IOException {
        File file = new File("/Users/dengtianjiao/Documents/image.png");
        FileInputStream fileInputStream = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile("copy" + file.getName(), file.getName(), ContentType.APPLICATION_OCTET_STREAM.toString(), fileInputStream);
        System.out.println(multipartFile.getName());
        fileUploadService.fileUpload(multipartFile);
    }
}
