package vorlesungen.woche03.Tag04Dokumentation

fun main() {
    val myName: String = "brian"
    val myNameBig: String = myName.erstesZeichenGross()
    println(myNameBig)
    println("-------------------------------------------------------")

    val myInt: Int = 10
    val myIntBy2: Int = myInt.multiplyBy2()
    println(myIntBy2)
    println("-------------------------------------------------------")

    println("Ist 5 gerade? ${5.geradeZahl()}")
    println("Ist 8 gerade? ${8.geradeZahl()}")
}
fun String.erstesZeichenGross(): String {
    return this.first().uppercase() + this.substring(1)
}

fun Int.multiplyBy2(): Int {
    return this * 2
}

fun Int.geradeZahl(): Boolean{
    return this % 2 == 0
}