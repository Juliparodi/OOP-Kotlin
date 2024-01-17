package com.pluralsight.OOPKotlin.EnumSealed

enum class ErrorCode(val errorCode: Int) {
    None(0),
    DatabaseError(500),
    NetworkError(200),
    UnknownError(1)
}