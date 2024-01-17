package com.pluralsight.OOPKotlin.generics

class SqlEnvelope<T>(val count: Int, val data: T) where T:List<Any?> {
}