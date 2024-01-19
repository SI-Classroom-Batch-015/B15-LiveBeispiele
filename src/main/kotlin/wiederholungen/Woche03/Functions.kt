fun rating(): Int {
    return (1..100).random()
    println("Diesr Satz wird nicht mit ausgegeben")
}

fun printValue(key: String) {
    val myMap = mapOf("Name" to "John", "Alter" to 25, "Stadt" to "Berlin")

    val value = myMap[key]

    println("$key: $value")
}

