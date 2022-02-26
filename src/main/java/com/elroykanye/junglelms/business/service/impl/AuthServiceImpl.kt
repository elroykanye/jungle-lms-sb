package com.elroykanye.junglelms.business.service.impl

import com.elroykanye.junglelms.api.dto.reqres.LoginRequest
import com.elroykanye.junglelms.api.dto.reqres.LoginResponse
import com.elroykanye.junglelms.api.dto.reqres.RegisterRequest
import com.elroykanye.junglelms.api.dto.reqres.RegisterResponse
import com.elroykanye.junglelms.business.service.AuthService
import com.elroykanye.junglelms.business.service.UserService
import com.elroykanye.junglelms.data.entity.User
import com.elroykanye.junglelms.exception.UserException
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.*

@Service
@RequiredArgsConstructor
class AuthServiceImpl(private val userService: UserService): AuthService {

    override fun login(loginRequest: LoginRequest): LoginResponse {
        // TODO Change this to using JWT
        val user = userService.findByUsername(loginRequest.username)
        if(loginRequest.password.equals(user.password))
            return LoginResponse.builder().id(user.userId).username(user.username).jwtToken(user.password).build()
        else throw UserException.UserCredentialsInvalidException(loginRequest.username)

    }

    override fun logout() {
        TODO("Not yet implemented")
    }

    override fun register(registerRequest: RegisterRequest): RegisterResponse {
        val userNew = User.builder()
            .username(registerRequest.username)
            .password(registerRequest.password)
            .build()

        return RegisterResponse.builder()
            .id(userService.save(userNew).userId)
            .username(userNew.username)
            .timeCreated(Date())
            .build()
    }
}