package com.pluralsight.OOPKotlin.UserTest

import com.pluralsight.OOPKotlin.testing.UserRepository
import testing.User

class MockRepository : UserRepository {
    override fun get(id: Int): User {
        return User(1)
    }

    override fun getAll(): List<User> {
        return listOf(User(1), User(2))
    }
}