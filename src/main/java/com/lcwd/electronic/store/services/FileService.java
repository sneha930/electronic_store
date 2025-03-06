package com.lcwd.electronic.store.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {

    // first argument is for file and second id path where image will be stored
    public String uploadImage(MultipartFile file, String path) throws IOException;

    // hum denge isse path aur wo hame iss path par rakha hua resouce return karega in the form of InputStream
    InputStream getResource(String path, String name) throws FileNotFoundException;
}
