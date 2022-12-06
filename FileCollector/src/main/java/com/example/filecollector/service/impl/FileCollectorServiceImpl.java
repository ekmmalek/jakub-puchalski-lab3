package com.example.filecollector.service.impl;

import com.example.filecollector.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileCollectorServiceImpl {

    private final List<FileService> fileServices;

    public void saveInCorrectPlace(String filename) {
        fileServices.forEach(fileService -> {
            try {
                fileService.save(filename);
            } catch (Exception e) {
                log.warn(e.getMessage());
            }
        });
    }

}

