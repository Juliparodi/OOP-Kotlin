package module45

class Person (private val serializable: Serializable) : Serializable {
    override fun save() {
        serializable.save()
    }
}