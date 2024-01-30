fun main() {
    val nameList: List<String> = listOf("Paul","Dieter", "Jannes", "Lukas", "Hans")
    val sortedList: MutableList<String> = mutableListOf("","", "", "", "")
    // Schreibe hier deinen Code:

    // Idee:
    // 1. Liste von vorne durchgehen,

    bonus8Var1(nameList, sortedList)


    bonus8Var2(sortedList, nameList)


    // Den Code hier drunter nicht ändern!
    val finishedlist: List<String> = listOf("Hans", "Lukas","Jannes", "Dieter", "Paul")
    if (sortedList == finishedlist) {
        println("Du hast die Aufgabe gelöst")
    } else {
        println("Leider noch nicht richtig, versuchs weiter!")
    }
}

private fun bonus8Var2(
    sortedList: MutableList<String>,
    nameList: List<String>
) {
    // 2. Variante
    // 1. Liste von vorne durchgehen, 2. Liste von hinten durchgehen mit 2 Schleifen, Elemente mit je Inhalt aus 1. Liste ersetzen

    var j = 0
    var r = sortedList.size - 1
    while (j < nameList.size) {
        while (r >= 0) {
            sortedList[r] = nameList[j]
            r--
            j++
        }
    }

    println(sortedList)
}

private fun bonus8Var1(
    nameList: List<String>,
    sortedList: MutableList<String>
) {
    var i = 0
    while (i < nameList.size) {
        // 1. Element aus nameList als letztes Element in sortedList schreiben, indem wir in der sortedList rückwärts durchgehen
        sortedList[sortedList.size - (i + 1)] = nameList[i]
        i++
    }
}