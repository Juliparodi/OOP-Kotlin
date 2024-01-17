package com.pluralsight.OOPKotlin.generics

import net.bytebuddy.asm.Advice.Local
import java.time.LocalDateTime

class Envelope<T>(val result: T?, val message: String?) {

    val timeGenerated: LocalDateTime

    init {
        timeGenerated = LocalDateTime.now()
    }
}