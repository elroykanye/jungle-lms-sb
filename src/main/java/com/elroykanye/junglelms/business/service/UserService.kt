package com.elroykanye.junglelms.business.service

import com.elroykanye.junglelms.data.entity.User

interface UserService {
    fun findAll(): List<User>
    fun findById(id: Long): User
    fun findByUsername(username: String): User


    fun save(user: User): User


    fun delete(id: Long)
}