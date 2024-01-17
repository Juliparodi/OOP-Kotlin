package com.pluralsight.OOPKotlin.entityClasses

//Data clases have a "copy" function but only primary properties are copied
//Data classes are used for entity types, database access and collections
data class PersonDataClass(var name: String, val url: String) {

    // not included in hashCode, equals, etc
    val givenName: String
    val otherName: String
    val canonicalName: String

    init {
        val parts = name.split(" ")
        givenName = parts[0].uppercase()
        otherName = parts[1].uppercase()
        canonicalName = name.uppercase()
    }

    override fun toString(): String {
        return "Person(name=$name, canonicalName=$canonicalName), url=$url"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PersonDataClass

        if (name != other.name) return false
        if (canonicalName != other.canonicalName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + canonicalName.hashCode()
        return result
    }


}