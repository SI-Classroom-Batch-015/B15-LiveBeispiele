package vorlesungen.Woche02

fun main() {
    // Liste anlegen
    val list: List<Int> = listOf(1,2,3,4,5,6)

    // Map anlegen
    val map: MutableMap<String, Int> = mutableMapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3
    )


    // Zugriff auf Listenelement:
    var lastIndex: Int = list.size-1 // size-1 gibt IMMER das letze Element zurück
    var lastElement: Int = list[lastIndex]
    // ODER:
    var lastElement2: Int = list.last()


    // Zugriff auf Map-Value: // hier kommt A raus, weil A am Key 1 steht
    var firstValue: Int? = map["a"]
    println("Erster Wert an stelle a: $firstValue")

    var nonNullAssertedValue: Int = map["b"]!! // !! sagen bescheid: hier steht auf keinen fall null drin, wenn doch stürz einfach ab

    // Element neu hinzufügen
    map.put("d",4)
    // ODER: fügt was neues hinzu, wenn der key noch nicht existiert.
    map["e"] = 5
    // a existiert bereits, wird jetzt mit der 6 überschrieben
    map["a"] = 6

    // mehrere Elemente gleichzeitig hinzufügen: putAll erwartet eine map
    map.putAll(mapOf("f" to 6, "g" to 7, "h" to 8))

    // Rechnen mit Map Keys:
    var result: Int = map["e"]!! + map["a"]!! // 11
    // ODER:
    var result1: Int? = map["e"]?.plus(map["a"]!!)

}