package testing

import com.pluralsight.OOPKotlin.testing.UserRepository

class SqlUserRepository(database: Database) : SqlRepository(database), UserRepository {
    override fun get(id: Int) : User {
        //use database to get the data
        return User(1)
    }

    override fun getAll() : List<User> {
        return listOf(User(10), User(1))
    }
}