package module123

open class Student(val course: String, name: String, id: Int) : PersonWithConstructor(name, id) {

    fun registerCourse(course: String) {

    }

    override fun addPet(name: String) {
        //doSomething()
        super.addPet(name)
        //doSomethingElse()
    }

}