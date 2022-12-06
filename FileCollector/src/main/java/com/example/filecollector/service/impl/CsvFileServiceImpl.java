package com.example.filecollector.service.impl;

import com.example.filecollector.enums.FileExtension;
import com.example.filecollector.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CsvFileServiceImpl implements FileService {

    private final FileExtension fileExtension = FileExtension.CSV;

    @Override
    public void save(String  filename) throws Exception {

        String extension = filename.split("\\.")[1];
        boolean isCorrectFileExtension = fileExtension.getExtension().equalsIgnoreCase(extension);

        checkFileExtension(isCorrectFileExtension);
    }

    private void checkFileExtension(boolean fileExtensionCondition) throws Exception {
        if (!fileExtensionCondition) {
            throw new Exception("Wrong file extension, should be .csv");
        }
    }

}
