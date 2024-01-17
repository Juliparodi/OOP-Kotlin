package module123
open class PersonWithConstructor(var name: String = "John", var id: Int = 1) {

    // LATEINIT to initialize with null an object, you MUST initialize it
    lateinit var address: Address

    //IT WILL BE EXECUTED WHEN YOU INITIALIZE AN OBJECT
    init {
        println("Initialized")
    }

    fun initAddress() {
        address = Address()
    }

    open fun addPet(name: String){}

    //RECOMMENDED TO NOT USE SECOND CONSTRUCT, USE DEFAULT VALUES INSTEAD

}