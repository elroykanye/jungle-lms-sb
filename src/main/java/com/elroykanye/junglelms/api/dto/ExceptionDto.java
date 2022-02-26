package com.elroykanye.junglelms.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class ExceptionDto {
    private String message;
    private String timestamp;
    private String status;
    private String error;
    private String path;
}
