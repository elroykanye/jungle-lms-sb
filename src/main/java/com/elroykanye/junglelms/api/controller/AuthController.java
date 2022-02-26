package com.elroykanye.junglelms.api.controller;

import com.elroykanye.junglelms.api.dto.reqres.LoginRequest;
import com.elroykanye.junglelms.api.dto.reqres.LoginResponse;
import com.elroykanye.junglelms.api.dto.reqres.RegisterRequest;
import com.elroykanye.junglelms.api.dto.reqres.RegisterResponse;
import com.elroykanye.junglelms.business.service.AuthService;
import com.elroykanye.junglelms.business.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = authService.login(loginRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "logout")
    public ResponseEntity<?> logout() {
        return null;
    }

    @PostMapping(value = "register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse response = authService.register(registerRequest);
        return ResponseEntity.ok(response);
    }
}
