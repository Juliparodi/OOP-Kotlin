package module45

class Undergraduate(override var grade: Int, name: String, id: Int) : Student(name, id) {

    override fun play() {
        println("playing tennis")
    }
}