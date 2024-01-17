package module123

class Pet {
    var name: String? = null
    var age: Int = 0
}

class PetOwner {
    var name = ""
    var id: Int = 0
    var pet = Pet()
    val isHuman = true
}