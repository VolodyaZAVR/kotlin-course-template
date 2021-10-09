typealias UserId = String

class User(
    val id: UserId,
    private val firstName: UserId,
    private val lastName: UserId
) {
    fun getFullName() : String = "$id $firstName $lastName"
}


fun main() {
    val user = User("15", "Ivan","Usovich")
    println(user.getFullName())
}