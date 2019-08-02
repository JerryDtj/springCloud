package com.learn.feignuploadclient.handle;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author jerry
 */
@FeignClient("feign-upload-server")
public interface FileUploadHandle {
    @PostMapping("/fileUploadHandle")
    void fileUploadHandle(MultipartFile file);
}
