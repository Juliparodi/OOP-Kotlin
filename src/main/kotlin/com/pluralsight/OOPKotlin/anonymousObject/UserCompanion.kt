package com.pluralsight.OOPKotlin.anonymousObject

class UserCompanion private constructor(name: String) {
    companion object Builder {
        fun build(firstName: String, lastName: String) : UserCompanion {
            return UserCompanion("$firstName $lastName")
        }
    }
}