class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "dessima@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "dt@gmail.com"
    println(contact.email)
}