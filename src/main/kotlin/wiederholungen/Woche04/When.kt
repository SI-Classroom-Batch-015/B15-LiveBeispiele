// When

fun main() {
    fun1()
}

/*
fun fun2() {
    val Wochentag
    val WochentagInNumemr

    if (Montag == 1) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }
    if (Dienstag == 2) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }
    if (Mittwoch == 3) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }
    if (Montag == 4) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }
    if (Montag == 1) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }

    if (Montag == 1) {
        println("die nummer 1 ist größer als nummer 2")
    } else {
        println(" die nummer 1 ist kleinr")
    }
}


 */

fun fun1() {
    println("bitte geben sie ein tag ein: ")
    val dayOfWeek = readln().toInt()

    val dayName = when (dayOfWeek) {
        1 -> "Montag"
        2 -> "Dienstag"
        3 -> "mittwoch"
        4 -> "Donnerstag"
        5 -> "Freitag"
        6 -> "Samstag"
        7 -> "Sonntag"
        else -> "Die Woche hat nur 7 Tage!"
    }

    println(dayName)
}
