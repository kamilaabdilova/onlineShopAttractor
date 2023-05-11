package com.example.hw65.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {
    private String message;
    private Object data;

    public static ExceptionResponse getErrorResponse(String message) {
        return ExceptionResponse.builder()
                .message(message == null ? "Произошла неизвестная ошибка" : message)
                .build();
    }

    public static ExceptionResponse getResponseWithBody(String message, Object data) {
        return ExceptionResponse.builder()
                .message(message)
                .data(data)
                .build();
    }
}