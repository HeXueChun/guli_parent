package com.hxc.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {

    String uploadFileAvator(MultipartFile file);
}
