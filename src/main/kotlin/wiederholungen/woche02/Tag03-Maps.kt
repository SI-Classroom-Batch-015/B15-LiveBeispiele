fun main() {
    // val mutableMap1: MutableMap<KeyType, ValueType> = mutableMapOf() -> SYNTAX

    // --- MAP Funktionen ---

    /*
    -  get(key) -> map.get(“Helene Fischer”) Gibt den Value innerhalb von key zurück (“Atemlos”)
    - .put(key, value) -> map.put(“Lorde”, “Ribs”) Tut key und value in die Liste. Falls der key schon exisitert, wird der bereits enthaltene value mit dem neuen value überschrieben
    - .containsKey(key) -> map.containsKey(“The Police”) Gibt true zurück, wenn die Map den key enthält
    - .containsValue(value) -> map.containsValue(“Atemlos”) Gibt true zurück, wenn die Map den Value enthält
    - .remove(key) -> map.remove(“Helene Fischer”) Entfernt Key und seinen Value (Atemlos) aus der Map
    - .clear() -> map.clear() leert die Map, alle Key-Value-Paare werden gelöscht
    - .keys -> map.keys gibt alle keys als Set zurück (da es eh keine doppelten Keys gibt)
    - .values -> map.values gibt alle values als Liste zurück (gleiche Values können öfter vorkommen)
*/



    val mutableMap1 = mutableMapOf(
        "Obst" to 10.999,
        "b" to 10,
        "c" to 100
    )

    val mutableMap2: MutableMap<String, Int> = mutableMapOf(
        "String1" to 1,
        "String2" to 10,
        "String3" to 100
    )

    val normaleMap: Map<String, Int> = mapOf(
        "Hausnummer1" to 32,
        "Hausnummer2" to 14,
        "Hausnummer3" to 16
    )

    // schlüsel abrufen

    val value = normaleMap["Hausnummer1"]
    println("Die Hausnummer zu dem Haus 1 ist: $value")

    // überprüfen ob ein schlüssel in der map vorhanden ist

    val keynachweis = normaleMap.containsKey("Hausnummer2")
    println(keynachweis)

    // --- MAP in LISTE

    val neueMap = mutableMapOf(
        "a" to 5,
        "b" to 45,
        "c" to 67
    )

    val neueListe = neueMap.toList()

    println(neueListe)

    val speedMap: Map<String, Double> = mapOf(
        "Auto" to 120.5,
        "Flugzeug" to 755.2,
        "Fahrrad" to 22.0,
        "Tretroller" to 15.7,
        "LKW" to 89.9
    )

    val speedkey = speedMap.keys.toList()
    println(speedkey)
}




