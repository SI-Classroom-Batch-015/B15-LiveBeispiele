package wiederholungen.woche02

fun main() {

    // Liste erstellen
    var namen: List<String> = listOf("Leon", "Marie", "Elias", "Anna", "Jonas", "Sophia", "Adrian", "Elisa", "Johanna")
    println(namen)

    // Ist die Liste leer?
    var isListEmpty: Boolean = namen.isEmpty()
    println(isListEmpty)

    // Was ist der kleinste (?) Name?
    var kleinsterName: String = namen.min()
    println(kleinsterName)

    // Was ist der größte (?) Name?
    var groessterName: String = namen.max()
    println(groessterName)

    // Was ist der erste Name?
    var ersterName: String = namen.first()
    println(ersterName)

    // Was ist der letzte Name?
    var letzterName: String = namen.last()
    println(letzterName)

    // Was ist der zweite Name?
    var zweiterName = namen[1]
    println(zweiterName)

    // Wie viele Namen sind in der Liste?
    var listGroesse: Int = namen.size
    println(listGroesse)

    // Sortiere die Namen
    var namenSortiert: List<String> = namen.sorted()
    println(namenSortiert)
    println(namen)

    // Leon verlässt den Kurs - entferne den Namen
    var namenVeraenderbar: MutableList<String> = namen.toMutableList()
    namenVeraenderbar.remove("Leon")
    println(namenVeraenderbar)

    // Der Lehrer hat schlechte Laune - der erste Schüler/in wird rausgeworfen
    namenVeraenderbar.removeFirst()
    println(namenVeraenderbar)

    // Nun wird auch der letzte Schüler herausgeworfen
    namenVeraenderbar.removeLast()
    println(namenVeraenderbar)

    // Ist Lea in der Klasse?
    var istLeaDa: Boolean = namenVeraenderbar.contains("Lea")
    println(istLeaDa)
    // Die Werte müssen nicht unbedingt in einer Variable gespeichert werden, um sie auszugeben.
    println(namenVeraenderbar.contains("Lea"))

    // Erstelle eine Liste mit allen Schülern in der Liste zwischen Jonas (inklusive) und Elisa (exklusive)?
    // Wir können den Index von einem Element in unserer Liste herausfinden, indem wir die Methode "indexOf(element)" verwenden.
    var indexJonas: Int = namenVeraenderbar.indexOf("Jonas")
    var indexElisa: Int = namenVeraenderbar.indexOf("Elisa")
    var sublistNamen = namenVeraenderbar.slice(2..4)
    var sublistIndizes = namenVeraenderbar.slice(indexJonas..indexElisa - 1)
    println(sublistNamen)
    println(sublistIndizes)

    // Bitte füge Felix an den Anfang der Liste
    namenVeraenderbar.add(0, "Felix")
    println(namenVeraenderbar)



    // An welcher Stelle steht Adrian?
    println("Adrian steht an Stelle ${namenVeraenderbar.indexOf("Adrian") + 1}")


    // Objekt zu Index (Ich habe den Index.)
    namenVeraenderbar[2]

    // Index zu Objekt (Ich habe das Objekt)
    namenVeraenderbar.indexOf("Adrian")

    // Die Top-SchülerInnen des Kurs sind in folgender Liste
    var leistungsTraeger: List<String> = listOf("Jonas", "Anna")

    // Erstelle eine Liste, in der alle SchülerInnen stecken, die gewöhnlichen oder mehr Unterstützung benötigen

}