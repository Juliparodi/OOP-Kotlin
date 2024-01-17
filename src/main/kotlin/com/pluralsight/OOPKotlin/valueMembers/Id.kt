package com.pluralsight.OOPKotlin.valueMembers

@JvmInline
value class Id(val id: String) {
    init {
        if (id.isEmpty()) throw IllegalArgumentException()
    }
}