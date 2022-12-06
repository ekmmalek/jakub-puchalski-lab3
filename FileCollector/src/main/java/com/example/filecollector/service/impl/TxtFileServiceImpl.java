package com.example.filecollector.service.impl;

import com.example.filecollector.enums.FileExtension;
import com.example.filecollector.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class TxtFileServiceImpl implements FileService {

    private final FileExtension fileExtension = FileExtension.TXT;

    @Override
    public void save(String  filename) throws Exception {
        String extension = filename.split("\\.")[1];
        boolean isCorrectFileExtension = fileExtension.getExtension().equalsIgnoreCase(extension);
        checkFileExtension(isCorrectFileExtension);
        System.out.println("ZAPISUJE DO ODPOWIEDNIEGO KATALOGU");
    }

    private void checkFileExtension(boolean fileExtensionCondition) throws Exception {
        if (!fileExtensionCondition) {
            throw new Exception("Wrong file extension, should be .csv");
        }
    }


}
