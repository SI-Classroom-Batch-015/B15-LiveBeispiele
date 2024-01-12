package vorlesungen.Woche02

import kotlin.random.Random

fun main() {

    // WIEDERHOLUNG
    // Listen

    // liste an artists anlegen
    var artistList: List<String> = listOf("Taylor Swift", "Eminem", "Metallica", "Tupac", "Lizzo", "Ed Sheeran", "Grimes", "Charlie XCX")

    // mutable kopie erstellen, auf die man schreibend zugreifen kann
    val mutableArtistList: MutableList<String> = artistList.toMutableList()


    // ein paar operationen
    // (Element einlesen und in die Liste speichern)
    println("Bitte gib deinen Lieblings Artist ein:")

    // 1. Eingabe in Variable speichern
    val input: String = readln()

    // 2. Element ans Ende schreiben
    mutableArtistList.add(input)

    // weitere Eingabe, vorletztes Element durch Eingabe ersetzen
    //mutableArtistList[mutableArtistList.size-2] = readln()

    // 3. welches ist das letzte Element? In einer Variable speichern
    val lastElement: String = mutableArtistList[mutableArtistList.size-1]
    // ODER
    var lastElement2: String = mutableArtistList.last()

    // FRAGE: Wie kann ich gezielt Eminem entfernen?
        // 1. simpelste Variante
        mutableArtistList.remove("Taylor Swift")

        // 2. mehrschrittige Variante: imagine... remove() existiert nicht. nur removeAt() existiert
        val indexEminem = mutableArtistList.indexOf("Eminem")
        mutableArtistList.removeAt(indexEminem)


    // 4.1 erstes Element rausschälen
    val first: String = mutableArtistList[0]
    // ODER
    val first2: String = mutableArtistList.first()
    // 4.1.2 entfernen
    mutableArtistList.remove(first)
    // ODER: ohne Variable
    mutableArtistList.remove(mutableArtistList.first())


    // 4.2 erstes Element in Variable speichern und gleichzeitig aus Liste entfernen
    val firstElement: String = mutableArtistList.removeFirst()


    // 5. liste alphabetisch sortieren, ausgeben
    println(mutableArtistList.sort())


    // 6. random listenElement speichern
    var randomListElement: String = mutableArtistList.random()


        // btw: zufällige Zahl speichern, mit Boolean analog
        var randomNumber = Random.nextInt()


    // NULL
    val firstName: String? = null
    val firstNameLength: Int? = firstName?.length
    println("Safe Call mit ?: es kommt null raus, falls in firstName null stehen sollte: $firstNameLength")
    //println("Non Null Asserted Call mit !!: es kommt eine NPE raus, falls in firstName null stehen sollte, das Programm stürzt ab: ${firstName!!.length}")




    // Maps

    val bestSongMap: Map<String,String> = mapOf(
        "Lorde" to "Ribs",
        "Die Ärzte" to "Ein Song namens Schunder",
        "Lizzo" to "The Sign",
        "Falling in Reverse" to "Voices in My Head",
        "Wu Tang Clan" to "Cream",
        "Bones" to "Human",
        "Jamiroquai" to "Cosmic Girl"
    )

    // Kopie der bestSong Map, die veränderbar ist, erstellen
    var mutableBestSong: MutableMap<String,String> = bestSongMap.toMutableMap()

    // ein paar operationen:
    // Was sind alle Values?
    val values = mutableBestSong.values
    // Einzelne Values: Value von Die Ärzte
    // getValue wirft NoSuchElementException, wenn der key nicht existiert.
    val aerzteSong: String = mutableBestSong.getValue("Die Ärzte")
    // ODER
    // [] Schreibweise kann null zurückgeben = Variable, in die gespeichert wird, muss nullable sein
    val lordeSong: String? = mutableBestSong["Lorde"]
    // ODER mit !! forcieren, dass wir bei null abstürzen
    val wuTangSong: String = mutableBestSong["Wu Tang Clan"]!!
    // ODER get: gibt null zurück, wenn key nicht existiert
    val jamiroSong: String? = mutableBestSong.get("Jamiroquai")

    // einen artist + song hinzufügen:
    mutableBestSong["Girl in Red"] = "Serotonin"
    // ODER
    mutableBestSong.put("Nena","99 Luftballons")


    // eintrag entfernen, egal welcher value drin steht
    val removedElement: String? = mutableBestSong.remove("Bones")
    println(removedElement)


    // eintrag nur entfernen, wenn er enthält, was wir im value spezifizieren:
    val removeLizzoSuccess: Boolean = mutableBestSong.remove("Lizzo","Good As Hell")
    println(removeLizzoSuccess)


//    // kleine Vorschau: Repeat Schleife
    var p1: MutableList<String> = mutableListOf()
    var p2: MutableList<String> = mutableListOf()
    // p1 und p2 sollen abwechselnd 3 Karten ziehen

    repeat(100){// it wird automatisch mitgeliefert, zählt bei jeder Iteration hoch
        // alles, was hier im Block {} steht, wird 3x wiederholt
        p1.add("${it+1}. Karte für p1")
        p2.add("${it+1}. Karte für p2")
    }
    println(p1)
    println(p2)






    println("----Neuer Stoff----")
    // Sonderfall: Konvertierung von Maps zu Listen
    val pairList: List<Pair<String,Int>> = listOf(
        Pair("Eins",1),
        Pair("zwei", 2)
    )
    val pairListToMap: Map<String,Int> = pairList.toMap()
    val pairListMutable = pairList.toMutableList()

    var myMap: Map<String, String> = mapOf(
        "DE" to "+49",
        "AT" to "+43",
        "PT" to "+351"
    )
    val myMapToList:  List<Pair<String, String>> = myMap.toList()
    println(myMapToList) // [(DE, +49), (AT, +43), (PT, +351)]

    // Die resultierende Liste enthält anschließend Pairs, also immer 2 Werte als ein Listenelement
    // auf den ersten oder zweiten Wert eines Pairs können wir dann mit first und second zugreifen
    println(myMapToList[0]) // (DE, +49)
    println(myMapToList[0].first) // DE
    println(myMapToList[0].second) // +49

    val list = listOf(1,2,3,4,5,6) //[1,2,3,4,5,6]
    println(list[0]) // 1
    // val listToMap = list.toMap() // nicht moeglich, kein Pair in der Liste enthalten. geht nur mit Pairs!


    // Eine Liste an Pairs kann auch wieder zu einer Map konvertiert werden
    val mapFromPairList: Map<String,String> = myMapToList.toMap()
    println(mapFromPairList)


    // Zugriff auf Indices von List-Items
    val namesList: List<String> = listOf("Lukas", "Leon", "Lennart")

    val ageList: List<Int?> = listOf(26,22,null)

    // Eine Map aus zwei Listen machen → myNamesList ist der Key und myAgeList der Value
    val nameMap: Map<String,Int?> = namesList.zip(ageList).toMap()
    val mutableNameMap = nameMap.toMutableMap()

    println(nameMap)
    mutableNameMap["Lennart"] = 24
    println(mutableNameMap)

    // Verschachtelte Map:
    var discographies: MutableMap<String, List<String>> = mutableMapOf(
        "Taylor Swift" to listOf("1989", "Speak Now", "Folklore", "Midnights"),
        "Lorde" to listOf("Pure Heroine", "Melodrama", "Solar Power"),
        "Biggie Smalls" to listOf("Ready to Die", "Life After Death", "Album3"),
        "Nena" to listOf("99 Luftballons", "Irgendwie, irgendwo, irgendwann", "Nur geträumt")
    )

    // auf eine liste in der map zugreifen und einen wert entfernen/verändern: wir wollen "Speak Now" löschen
    // 1. die liste anhand des keys rausholen, zwischenspeichern
    var taylorSongs: MutableList<String>? = discographies["Taylor Swift"]?.toMutableList()

    // 2. das element aus der liste entfernen
    taylorSongs?.remove("Speak Now")

    // 3. die veränderte Liste in den passenden Value schreiben. Warum brauchen wir .toList?
    discographies["Taylor Swift"] = taylorSongs!!.toList()


    // SETS

    // bereits erstellte Liste zum Set machen
    println(artistList)
    var mutableArtistSet: MutableSet<String> = artistList.toMutableSet()
    println(mutableArtistSet)

    // auf einen wert per index zugreifen: nur mit .elementAt() möglich
    var secondArtist = mutableArtistSet.elementAt(1)

    // doppelten wert hinzufügen -> Was passiert?
    mutableArtistSet.add("TuPac")
    println(mutableArtistSet)
    mutableArtistSet.add("Biggie Smalls")
    println(mutableArtistSet)


}
