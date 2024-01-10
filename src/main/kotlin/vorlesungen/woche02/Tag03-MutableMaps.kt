package vorlesungen.woche02

import java.util.SortedMap


fun main() {
    val articles: Map<String, Double> = mapOf(
        "Banane" to 1.49,
        "Apfel" to 0.99,
        "Kiwi" to 0.49
    )
    val mutableArticles = articles.toMutableMap()

    // wichtige schreibende Map Operationen (NUR auf MutableMaps möglich)


    // put(key, value) fügt ein neues Key Value Paar hinzu (oder überschreibt den Value eines Existierenden Keys, wenn der übergebene Key damit übereinstimmt)
    val oldBananaPrice: Double? = mutableArticles.put("Banane", 1.99)
    println("Banane kostete vorher: $oldBananaPrice")
    println("Banane kostet jetzt: ${mutableArticles["Banane"]}")

    val oldCherryPrice: Double? = mutableArticles.put("Kirsche",2.49)
    println("Kirsche kostete vorher: $oldCherryPrice")
    println("Kirsche kostet jetzt: ${mutableArticles["Kirsche"]}")
    println(mutableArticles)

    // bereits vorhandenen Wert ueberschreiben
    mutableArticles["Kiwi"] = 0.98
    println(mutableArticles)

    // neuen Wert hinzufuegen: neuen Key mit Wert schreiben, wird ans Ende gehängt
    mutableArticles["Marmelade"] = 1.99
    mutableArticles["Mango"] = 3.49
    println(mutableArticles)

        // Bonus Content: Sorted Maps
        val articlesSorted: SortedMap<String,Double> = mutableArticles.toSortedMap()
        println(articlesSorted)

    // remove mit Key-Übergabe: Entfernt Value und Key, gibt den gelöschten Value (nicht Key) zurück
    var removedValue: Double? = mutableArticles.remove("Banane")
    println("Preis der entfernten Banane war: $removedValue")


    // remove mit key UND value übergabe: der value muss genau zum key passen, sonst wird false zurückgegeben und nichts gelöscht
    var isValueRemoved: Boolean = mutableArticles.remove("Marmelade",1.99) // true
    var isValueRemoved2: Boolean = mutableArticles.remove("Kiwi",10.99) // false

    println("Marmelade entfernen geklappt? -> $isValueRemoved")
    println("Kiwi entfernen geklappt? -> $isValueRemoved2")
    println(mutableArticles)

    // clear() löscht alle elemente aus der map
    mutableArticles.clear()
    println("MutableArticlesMap nach dem aufruf von clear():")
    println(mutableArticles)

    // mit [] neue elemente hinzufügen: wenn der key nicht existiert, wird er mit dem value neu hinzugefügt
    mutableArticles["Zahnpasta"] = 2.49
    mutableArticles["Duschgel"] = 1.49
    mutableArticles["Shampoo"] = 2.99
    println(mutableArticles)
    var moreProducts: Map<String,Double> = mapOf(
        "Zahnseide" to 0.99,
        "Seife" to 1.39,
        "BartShampoo" to 4.99,
        "Pinzette" to 1.59
    )
    // putAll: äquivalent zu addAll bei lists, fügt map zur mutableMap hinzu
    mutableArticles.putAll(moreProducts)
    println(mutableArticles)


    // mit [] den Value bestehender Keys verändern / value eines bereits vorhandenen Elements überschreiben:
    mutableArticles["Seife"] = 10.39


    // Nullability bei Maps: mit Datentyp angabe, sonst automatisch
    var zahnpastaPreis: Double? = mutableArticles["Zahnpasta"]
    var shampooPreis: Double? = mutableArticles.get("Shampoo")


    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:






    // Operationen an Listen in Maps
    // Element hinzufügen: Junge an Die Arzte hinzufuegen

    // Element an bestimmten index hinzufuegen



    // Element entfernen

    // neuen Key und Value in die Map einfügen
    // gleiches Prinzip wie hier:  mutableArticles["Orange"] = 0.99

    // Key und dessen Value entfernen


    // Existiert ein bestimmter Key?
    // analog zu: articles.containsKey("Milch")


    // existiert ein bestimmes Element in den Values eines Keys?
    // existiert der song Blank Space in der Taylor Entry?

}