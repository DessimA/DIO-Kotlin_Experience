fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) { 
        return "A String tem tamanho: ${maybeString.length}"
    } else {
        return "String vazia ou nula"
    }
}

fun main() {
    //Forma errada
    //var neverNull: String = "Está variavel não pode ser nula"
    //neverNull = null

    //Forma correta
    var nullable: String? //Está variavel pode receber nulo, a "?" informa que a variavel pode receber valores do tipo String ou null
    nullable = null

    println(nullable)

    //var inferredNonNull = "Por inferencia o compilador entende que é uma String não nula"

    //inferredNonNull = null

    fun strLength(notNull: String?): Int {
        return notNull?.length ?: 0
    }

    //strLength(neverNull)
    println(strLength(nullable)) //Se o valor for 0 a variavel é nula
    println(strLength("variavel"))

    println(describeString(null))
    println(describeString("palavra"))
    println(describeString(""))

}