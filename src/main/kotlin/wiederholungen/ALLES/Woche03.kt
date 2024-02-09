package wiederholungen.ALLES

import VORLESUNG.Woche03.Tag13Parameter.sum

fun main() {

    var ergebnis: Unit = withoutReturn()
    println(ergebnis) // kotlin.Unit

    println(withStringReturn()) // "Diese Funktion hat keinen return..."

    summeBerechnen(withIntReturn(),9.0)
    summeBerechnen(2,9.0)

    var numberList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7)

    var hat5Geklappt: Boolean = hatHinzufuegenGeklappt(numberList,5) // false

    var hat10geklappt: Boolean = hatHinzufuegenGeklappt(numberList,10) // true

    println(numberList)


}

fun withStringReturn(): String {
    return "Diese Funktion hat keinen return..."

}

fun withoutReturn(): Unit {
    println("Diese Funktion hat keinen return...")
}

fun withReturn(): String? {

    return null
}
fun withIntReturn(): Int{
    return 1+1
}

fun returnList(): List<Int> {
    return listOf(1,2,3)
}

/**
 * Berechnet die Summe von 2 zahlen
 * @param zahl1: die erste Zahl, Int
 * @param zahl2: die zweite Zahl, Double
 * @return das Ergebnis, ein Double
 */

fun summeBerechnen(zahl1: Int, zahl2: Double): Double {
    var result = zahl1+zahl2
    return result

    // ODER
    return zahl1+zahl2
}

/**
 * gibt das letzte Element aus einer Liste zurück
 * @param list eine Liste an Strings
 * @return einen String
 */

fun returnLastElement(list: List<String>): String {
    return list.last()
    return list[list.size-1]
}

/**
 * gibt true zurueck und fuegt eine Zahl an eine Liste an Ints hinzu, wenn sie noch nicht darin vorhanden ist. Wenn doch, geben wir false zurueck.
 * @param list liste an Int zahlen, die verändert werden soll
 * @param zahl Int, das ggf hinzugefuegt wird und bei dem geschaut wird, ob es schon in der Liste ist
 * @return boolean, ob hinzufuegen geklappt hat oder nicht
 */
fun hatHinzufuegenGeklappt(list: MutableList<Int>, zahl: Int): Boolean {
    if (zahl in list){
        println("Die Zahl $zahl ist schon in der Liste!")
        return false
    } else {
        println("Die Zahl $zahl ist noch nicht in der Liste! Wird hinzugefuegt...")
        list.add(zahl)
        return true
    }
}