package com.pluralsight.OOPKotlin.testing

import testing.User


interface UserRepository : Repository {

    fun get(id: Int) : User
    fun getAll() : List<User>
}