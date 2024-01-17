package module45

import module123.PersonWithConstructor

//We do not need to use open, is open by default
abstract class Student(name: String, id: Int) : PersonWithConstructor(name, id) {
    abstract var grade: Int
    abstract fun play()

}