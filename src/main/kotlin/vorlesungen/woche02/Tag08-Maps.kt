package vorlesungen.Woche02

// generelle formel: var mapName: Map<Key-Datentyp, Value-Datentyp> = mapOf(key1 to value1, key2 to value2, etc)
val ARTICLES: Map<String, Double> = mapOf(
    "Banane" to 1.49,
    "Apfel" to 0.99,
    "Kiwi" to 0.49
)

fun main(){
// Map anlegen

    // zur Erinnerung: List anlegen
    var list: List<String> = listOf(
        "a",
        "b",
        "c"
    )
    println(list)
    println("Das erste Element in der Liste ist: ${list[0]}")
    println("Das erste Element in der Liste ist: ${list.get(0)}")



    println(ARTICLES)
    println("Der Preis der Banane in der articles map ist: ${ARTICLES["Banane"]}")
    println("Der Preis der Banane in der articles map ist: ${ARTICLES.get("Banane")}")
    println("Alle Preise in der articles map: ${ARTICLES["Banane"]},${ARTICLES["Apfel"]},${ARTICLES["Kiwi"]}")
    println("Alle Producte(Keys) in der articles Map: ${ARTICLES.keys}")
    println("Alle Preise(Values) in der articles map: ${ARTICLES.values}")




// wichtige lesende Map Operationen (lesend, auf Maps und MutableMaps anwendbar, Äquivalent zu vielen Listenoperationen)

    // size
    val articlesSize: Int = ARTICLES.size // 3
    println(articlesSize)


    // isEmpty
    val articlesEmpty: Boolean = ARTICLES.isEmpty()
    println(articlesEmpty)


    // contains: will den Key, nicht den Value. sagt uns, ob der Key enthalten ist oder nicht, gibt true zurück wenn ja, false wenn nein
    var containsApple: Boolean = ARTICLES.contains("Apfel") // true
    println(containsApple)


    // containsKey()
    var containsBirne = ARTICLES.containsKey("Birne")
    println(containsBirne) // false


    // containsValue() : hiermit können wir direkt die Values durchsuchen
    var contains99ct: Boolean = ARTICLES.containsValue(0.99) // true

    // get(key)  (äquivalent zu articles[key]) -> gibt den value des keys zurück
    val priceKirsche: Double? = ARTICLES.get("Kirsche")
    val priceApfel: Double? = ARTICLES["Apfel"]
    println("Preis Kirsche: $priceKirsche")
    println("Preis Apfel: $priceApfel")


    // .keys  gibt alle keys als SET zurück (keine Doppelungen)
    val allKeys: Set<String> = ARTICLES.keys
    println(allKeys)

    // .values  gibt alle values als Kollektion zurück
    val allValues: Collection<Double> = ARTICLES.values
    println(allValues)


    // .entries gibt alle einträge zurück
    val allEntries: Set<Map.Entry<String,Double>> = ARTICLES.entries
    println(allEntries)


}