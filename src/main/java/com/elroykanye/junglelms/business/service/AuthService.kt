package com.elroykanye.junglelms.business.service

import com.elroykanye.junglelms.api.dto.reqres.LoginRequest
import com.elroykanye.junglelms.api.dto.reqres.LoginResponse
import com.elroykanye.junglelms.api.dto.reqres.RegisterRequest
import com.elroykanye.junglelms.api.dto.reqres.RegisterResponse

interface AuthService {
    fun login(loginRequest: LoginRequest): LoginResponse
    fun logout()
    fun register(registerRequest: RegisterRequest): RegisterResponse
}