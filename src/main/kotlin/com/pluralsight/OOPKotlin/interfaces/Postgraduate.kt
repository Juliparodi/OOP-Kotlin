package module45

class Postgraduate(name: String, id: Int) : Student(name, id) {

    private var _grade = 0

    override var grade: Int
        get() = _grade
        set(value) {
            if(value < 0) throw Exception()
            _grade = value
        }

    override fun play() {
        TODO("Not yet implemented")
    }

}