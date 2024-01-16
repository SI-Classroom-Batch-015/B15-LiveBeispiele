package vorlesungen.woche03.Tag02ReturnWerte

fun main() {
    // nicht möglich: mit Ergebnis von product() in der main weiterzuarbeiten
//    var y = product() // hier kommt Kotlin.Unit raus, weil product() kein return hat
//
//    // product with return:
//    val x: Double = productWithReturn() // pWR gibt ein Double zurück, mit dem wir weiterarbeiten können.
//    println("Ergebnis: $x")
//
//    val result = x+10.0
//    println("2. Ergebnis, in dem $x + 10 gerechnet wurde: $result")

//
    // is Number Even aufruf: gibt true zurück, wenn input gerade ist und false wenn nicht
    val zahlGerade: Boolean = isNumberEven()
    println("Ist die Zahl gerade? -> $zahlGerade")
}



// produkt berechnen, NICHT zurückgeben
fun product() {
    println("Bitte gib eine Zahl ein...")
    val input1: Double = readln().toDouble()

    println("Bitte gib eine weitere Zahl ein...")
    val input2: Double = readln().toDouble()

    val product: Double = input2 * input1

    println("Das Produkt von $input1 und $input2 ist: $product")
}

// produkt berechnen, zurückgeben

fun productWithReturn(): Double {
    println("Bitte gib eine Zahl ein...")
    val input1: Double = readln().toDouble()

    println("Bitte gib eine weitere Zahl ein...")
    val input2: Double = readln().toDouble()

    val product: Double = input2 * input1

    println("Das Produkt von $input1 und $input2 ist: $product")

    return product
}


// selbe rechnung, kürzere schreibweise ohne Variablen:
fun productShort(): Double {
    println("Gibt 2 Zahlen ein, die multipliziert werden sollen...")
    return readln().toDouble() * readln().toDouble()
}


// ist die Zahl gerade?

fun isNumberEven(): Boolean {
    println("Bitte gib eine Zahl ein...")
    // user gibt zahl ein
    var input: Int = readln().toInt()

    // prüfen, ob input gerade ist oder nicht:
    // == vergleichender Operator, gibt true zurueck, wenn beide Seiten übereinstimmen
    val isEven: Boolean = input%2 == 0
    return isEven
}




