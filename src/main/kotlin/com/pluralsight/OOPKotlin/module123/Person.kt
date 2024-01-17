package module123

// Classes are closed by default like "final" in java. So i cannot extend Person
// All classes derive from "Any" class in Kotlin, like "Object" in Java
class Person {
    var name: String = ""
        get() = field
        set(value) {
            if(value.isEmpty()) {
                throw Exception("value cannot be empty")
            }
            field = value
        }

    val hasEaten: Boolean
        get() = calories != 0
    var calories = 0



    fun feed(foodStuff: String) {
        println("$name has been fed $foodStuff")
        updateCalories(100)
    }

    private fun updateCalories(calories: Int) {
        this.calories += calories
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    fun replace (value: String) : String {
        val regex = Regex("\\s+")
        return regex.replace(value, " ")
    }
}
