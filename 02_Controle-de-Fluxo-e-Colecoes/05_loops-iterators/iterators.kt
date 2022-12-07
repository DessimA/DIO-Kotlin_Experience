class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("zebra"), Animal("lion"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Whatch out, it's a ${animal.name}")
    }
}