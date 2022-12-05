fun main() {
    fun printALL(vararg messages: String) {
        for (m in messages) println(m)
    }
    printALL("Olá", "Hello", "Hallo", "Salut", "Hola")

    fun printALLWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printALLWithPrefix(
        "Olá", "Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printALL(*entries)
    }
    log("Olá", "Hello", "Hallo", "Salut", "Hola")
}