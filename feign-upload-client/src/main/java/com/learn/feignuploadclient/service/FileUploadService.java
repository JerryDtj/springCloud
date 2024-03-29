package com.learn.feignuploadclient.service;

import com.learn.feignuploadclient.handle.FileUploadHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @author Jerry
 * @Date 2019-08-02 08:19
 */
@Service
public class FileUploadService {
    @Autowired
    private FileUploadHandle fileUploadHandle;

    @PostMapping(value = "/fileUpload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void fileUpload(MultipartFile file) {
        fileUploadHandle.fileUploadHandle(file);
    }
}
