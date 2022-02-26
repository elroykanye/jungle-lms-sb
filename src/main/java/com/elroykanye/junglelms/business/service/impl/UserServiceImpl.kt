package com.elroykanye.junglelms.business.service.impl

import com.elroykanye.junglelms.business.service.UserService
import com.elroykanye.junglelms.data.entity.User
import com.elroykanye.junglelms.data.repository.UserRepository
import com.elroykanye.junglelms.exception.UserException
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.*

@Service
@RequiredArgsConstructor
class UserServiceImpl(
    private val userRepository: UserRepository
): UserService {
    override fun findAll(): List<User> {
        return userRepository.findAll()
    }

    override fun findById(id: Long): User {
        val userOpt: Optional<User> = userRepository.findById(id)
        if(userOpt.isPresent) {
            return userOpt.get()
        } else {
            throw UserException.UserNotFoundWithIdException(id)
        }
    }

    override fun findByUsername(username: String): User {
        val userOpt: Optional<User> = userRepository.findByUsername(username)
        if(userOpt.isPresent) return userOpt.get()
        else throw UserException.UserNotFoundWithUsernameException(username)
    }

    override fun save(user: User): User {
        if(userRepository.findByUsername(user.username).isPresent) {
            throw UserException.UserAlreadyExistsException(user.username)
        }
        return userRepository.save(user)
    }

    override fun delete(id: Long) {
        if(userRepository.findById(id).isPresent) userRepository.deleteById(id)
        else throw UserException.UserNotFoundWithIdException(id)
    }

}