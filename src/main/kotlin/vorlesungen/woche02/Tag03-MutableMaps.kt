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
    // ODER: über []
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
    // ODER:
    var shampooPreis: Double? = mutableArticles.get("Shampoo")

    val taylorSongList: MutableList<String> = mutableListOf("Shake it Off", "Blank Space", "Lavender Haze")

    // Komplexere Map, die je einen Key auf eine Liste an Values mappt:
    var music: MutableMap<String,MutableList<String>> = mutableMapOf(
        "Lorde" to mutableListOf("Ribs", "Royals", "Solar Power"),
        "Lizzo" to mutableListOf("Juice","Truth Hurts", "Rumors"),
        "Taylor Swift" to taylorSongList
    )

    println(music)


    // Operationen an Listen in Maps
    // Key Value Paar hinzufügen:
    music.put("Metallica", mutableListOf("Nothing Else Matters", "One", "Hit The Lights"))
    println(music)
    // ODER:
    music["Michael Jackson"] = mutableListOf("Thriller", "Billie Jean", "Smooth Criminal", "Beat It")
    println(music)

    // existierenden Wert überschreiben
    music["Taylor Swift"] = mutableListOf("Anti-Hero","Lavender Haze", "Clean")
    println(music)

    // Element bei Taylor Swift and Ende hinzufuegen
    // 1. Schritt: Liste rausschälen, 2. Schritt: darauf .add() anwenden
    var addSongWorked: Boolean? = music["Taylor Swift"]!!.add("Maroon")

    // Element bei Lorde an Index 0 hinzufuegen
    music["Lorde"]!!.add(0,"The Path")

    music["Helene Fischer"]?.add("Atemlos") // ? bedeutet: gib null aus und stürz nicht ab

    println(music)

    // Element entfernen
    music["Metallica"]!!.remove("One") // !! bedeutet: keine sorge, ist nicht null, stürz ab wenn doch

    // Key und dessen Value entfernen
    var removedList: MutableList<String>? = music.remove("Taylor Swift")

    // Existiert ein bestimmter Key?
    // analog zu: articles.containsKey("Milch")
    var taylorExists: Boolean = music.contains("Taylor Swift")


    // existiert ein bestimmes Element in den Values eines Keys?
    // existiert der song Billie Jean bei Michael Jackson?
    var billieExists: Boolean? = music["Michael Jackson"]?.contains("Billie Jean") // true


    articles.keys.elementAt(articles.keys.size-1)

}