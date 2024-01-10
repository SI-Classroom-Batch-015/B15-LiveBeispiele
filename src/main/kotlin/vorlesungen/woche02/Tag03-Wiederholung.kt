package vorlesungen.woche02

fun main() {
    val nameList: MutableList<String> = mutableListOf("Alice", "Bobby", "Charlie", "Dennis", "Emilia")
    println("Vorhandene Namen in der Liste: $nameList")


    println("Bitte gibt einen Namen ein")
    var name1: String = readln()
    println("Bitte gibt einen Namen ein")
    var name2: String = readln()
    println("Bitte gibt einen Namen ein")
    var name3: String = readln()
    nameList.addAll(listOf(name1,name2,name3))

    println("Vorhandene Namen in der Liste: $nameList")

    println("Bitte gib eine Zahl von 1 bis ${nameList.size} ein, um den jeweiligen Namen auszugeben...")
    val indexPlusOne: Int = readln().toInt()

    println("Du hast die $indexPlusOne gewählt!")
    Thread.sleep(500)
    println("Passender Name wird aus der Liste gefischt...")
    Thread.sleep(1000)
    println("An ${indexPlusOne}. Stelle in der Liste stand: ${nameList[indexPlusOne-1]}")



}