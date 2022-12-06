package com.example.filecollector.configuration;

import com.example.filecollector.service.impl.CsvFileServiceImpl;
import com.example.filecollector.service.FileService;
import com.example.filecollector.service.impl.TxtFileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class FileConfiguration {

    private final CsvFileServiceImpl csvFileService;

    private final TxtFileServiceImpl txtFileService;

    @Bean
    public List<FileService> fileServices(){
        return List.of(
              csvFileService,
                txtFileService
        );
    }

}
