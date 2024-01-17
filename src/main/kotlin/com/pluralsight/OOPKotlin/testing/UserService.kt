package testing

import com.pluralsight.OOPKotlin.testing.UserRepository

class UserService(private val userRepository: UserRepository) {
    fun getUser(id:Int) : User {
        return userRepository.get(id)
    }

    fun getAllUsers() : List<User> {
        return userRepository.getAll()
    }
}