package com.pluralsight.OOPKotlin.valueMembers

@JvmInline
//VALUE cannot have var variables and can only have 1 variable
value class GivenName(val name: String) {
    val length : Int
        get() = name.length


    init {
        if (name.isEmpty()) throw IllegalArgumentException()
        if (name.contains(" ")) throw IllegalArgumentException()
    }
}