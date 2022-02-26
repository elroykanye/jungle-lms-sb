package com.elroykanye.junglelms.api.dto.reqres;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private Long id;
    private String username;
    private String jwtToken;
}
