fun main() {
    // UND
    UNDverknüpfung(true, false)
    UNDverknüpfung(false, false)
    UNDverknüpfung(true, true)
    // OR
    ORverknüpfung()
    // komplexeverknüpfung
    komplexeverknüpfung(20, 40, true)
    komplexeverknüpfung(456, 234, false)
    // fun2
    fun2()
    // when
    whenOperatorAnwenden()

}

/*
    *** Vergleichsoperatoren ***

== : Gleichheit
!= : Ungleichheit
< : Kleiner als
> : Größer als
<= : Kleiner gleich
>= : Größer gleich

    *** Verknüpfungsoperatoren / Logische Operatoren

&& : logisches UND (and)
|| : logisches ODER (or)
! : logisches NICHT (not)
 */

// UND -> ist nur true, wenn beide operatoren true sind

fun UNDverknüpfung(bool1: Boolean, bool2: Boolean) {
    if (bool1 && bool2) {
        println("der term ist true")
    } else {
        println("der term ist nicht true")
    }
}

// oder / OR -> gibt true zurück, wenn mindestens ein Wert true ist oder aber auch beide werte

fun ORverknüpfung() {
    val bool1 = true
    val bool2 = false

    val result = bool1 || bool2

    println("Ergebniss des logischen ODER: $result")
}

// komplexeverknüpfung(456, 234, false)
fun komplexeverknüpfung(number1: Int, number2: Int, bool: Boolean): Boolean {
    var result = (number1 >= number2 || number2 >= number1) && !bool
    println("lösung ist $result")
    return result
}

fun fun2() {
    komplexeverknüpfung(3,5,true)
    val number1 = 100
    val number2 = 200

    if (number1 > number2) {
        println("nummer 1 ist größer als nummer $number2")
    } else {
        println("nummer 1 ist nicht größer als nummer $number2")
    }
}

fun whenOperatorAnwenden() {
    println("Bitte geben sie eine Zah ein: ")
    val zahl: Int = readln().toInt()

    when {
        zahl >= 40 -> println("1")
        zahl >= 30 -> println("der wert ist größer oder gleich 30")
        zahl >= 20 -> println("3")
        zahl >= 10 -> println("4")
        else -> {
            if (zahl == 0) {
                println("Super unsere Zahl ist Null!")
            } else {
                println("ist nicht Null!")
            }
        }
    }
}