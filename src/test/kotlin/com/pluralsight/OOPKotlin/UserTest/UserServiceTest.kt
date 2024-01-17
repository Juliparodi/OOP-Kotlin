package com.pluralsight.OOPKotlin.UserTest

import com.pluralsight.OOPKotlin.testing.UserRepository
import io.mockk.every
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import testing.UserService
import io.mockk.mockk
import testing.User

class UserServiceTest {

    private lateinit var service: UserService
    private lateinit var repository: UserRepository


    @BeforeEach
    fun setUp() {
        repository = mockk<UserRepository>()
        service = UserService(repository)
    }


    @Test
    fun whenCallGetAllUsers_ShouldGetAllUsersFromTheRepository() {

        every { repository.getAll() }.returns(listOf(User(1), User(2)))

        val users = service.getAllUsers()
        Assertions.assertEquals(2, users.size)
    }

    @Test
    fun whenCallGetUser_ShouldGetAllUsersFromTheRepository() {

        every { repository.get(1) }.returns(User(1))
        val user = service.getUser(1)
        Assertions.assertEquals(1, user.id)
    }
}