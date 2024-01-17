package com.pluralsight.OOPKotlin.EnumSealed

// Much more flexible that enumerations
// Have data and methods
sealed class Error(open val errorCode: Int) {

    abstract fun getMessage() : String
    class NetworkError(override val errorCode: Int) : Error(errorCode) {
        override fun getMessage(): String = "$errorCode"
    }

    class DatabaseError(val errorCode: Int, val errorMessage: String) {
        fun getMessage(): String = "$errorCode"

        fun isSafeToContinue() : Boolean {
            //do some processing
            return errorCode < 100
        }
    }

}