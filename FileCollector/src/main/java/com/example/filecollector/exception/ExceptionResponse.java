package com.example.filecollector.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ExceptionResponse {

    private List<String> messages;

    private LocalDateTime errorTime;

    private int errorCode;

}
