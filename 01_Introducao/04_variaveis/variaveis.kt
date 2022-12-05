fun main() {
    
    var a: String = "initial" // var aceita alteração de valor, nesse caso não é obrigatório informar q é uma variavel do tipo String, o kotlin infere que o valor é uma String em função do valor atribuido, o mesmo aconteceria se fosse o valor 123 que seria reconhecido como Int.
    println(a)
    a = "final"
    println(a)

    val b: Int = 1            // val não aceita alteração de valor
    val c = 3                 // aqui c é reconhecido como Int sem a necessidade de informar o tipo
    println("O valor de b é $b")
    println("O valor de c é $c")

    fun someCondition() = true

    val d: Int
    //println(d) Uma variavel não pode ser utilizada enquanto não for atribuido valor

    if (someCondition()) {
        d = 1
    }else {
        d = 2
    }

    println("O valor de d é $d") // Agr a variavel foi inicializada, lembrando que val pode atribuido valor somente uma vez
}