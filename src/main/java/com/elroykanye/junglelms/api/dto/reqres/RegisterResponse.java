package com.elroykanye.junglelms.api.dto.reqres;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse {
    private Long id;
    private String username;
    private Date timeCreated = new Date();
}
