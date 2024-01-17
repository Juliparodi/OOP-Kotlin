package com.pluralsight.OOPKotlin.EnumSealed

class RuntimeError : Error() {
    override fun getMessage(): String = "runtimeError"
}