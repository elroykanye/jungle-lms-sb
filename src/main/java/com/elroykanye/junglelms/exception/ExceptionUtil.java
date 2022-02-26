package com.elroykanye.junglelms.exception;

import com.elroykanye.junglelms.api.dto.ExceptionDto;
import org.springframework.http.HttpStatus;

public class ExceptionUtil {
    public static ExceptionDto createExceptionResponseBody(String message, HttpStatus httpStatus) {

        return ExceptionDto.builder()
                .timestamp(String.valueOf(System.currentTimeMillis()))
                .status(String.valueOf(httpStatus.value()))
                .error(httpStatus.getReasonPhrase())
                .message(message)
                .build();

    }
}
