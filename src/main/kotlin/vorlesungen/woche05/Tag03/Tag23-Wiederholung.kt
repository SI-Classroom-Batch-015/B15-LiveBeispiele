package VORLESUNG.Woche05.Tag23
fun main(){

    val numbersList = mutableListOf(22,34,808,99,6,4,7)

    // 1. simple for in schleife mit liste an an ints

    for (nr in numbersList) println(nr)

    println()

    println("-----")

    // 2. größte Zahl in Liste finden
    // 2.1 Variable, in der wir die groesste zahl speichern, erstmal 0 reinschreiben
    var max: Int = 0

    // 2.2 Schleife machen, mit der wir jede Zahl in der Liste anschauen
    for (nr in numbersList){
        // und mit max vergleichen
        // WENN angeschaute aktuelle nr > max ist
        if (nr > max) {
            // nr in max reinschreiben
            max = nr
        }
    }

    println("Die groesste Zahl ist: $max")
















}
