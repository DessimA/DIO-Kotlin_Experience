val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main(){
    addSystemUsers(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach{
        i -> println("Some useful info on user $i")
    }
}