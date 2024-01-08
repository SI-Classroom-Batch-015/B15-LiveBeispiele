package vorlesungen.woche02

fun main() {

    // LISTS: nur LESENDE Operationen, kann nicht nachträglich verändert werden

    // syntax reminder: einfache variable anlegen
    var firstName: String = "Harry"

    // komplexere syntax: list variable anlegen
    val firstNameList: List<String> = listOf("Harry","Ron","Hermine","Luna")
    println("Liste an Vornamen: $firstNameList")
    val lastNameList: List<String> = listOf("Potter", "Weasley", "Granger", "Lovegood")
    println(lastNameList)

    val numbersList: List<Int> = listOf(7,8,9,1,2,5,6,3,4)

    val emptyList: List<Double> = listOf(        )
    println("Leere Liste: $emptyList")

    // Index benutzen: Vorsicht: fängt bei 0 an zu zählen

    // arbeiten mit dem Index []: ich will Luna aus der firstNameList schälen
    // in die [ ] kommt immer ein Integer rein!
    var lastElement: String = firstNameList[3]
    println("Letzter Vorname: $lastElement")
    // erstes Element mit Variable rausholen:
    var firstIndex: Int = 0
    var firstElement: String = firstNameList[firstIndex]
    println("Erster Vorname: $firstElement")

    // .size gibt die Länge einer Liste zurück, analog zu string.length
    var sizeOfNameList: Int = firstNameList.size
    println("Länge der Vornamenliste: $sizeOfNameList")
    println("Länge der Nachnamenliste: ${lastNameList.size}")

    // mit size und index arbeiten:
    // wir wollen das letzte element rausschälen und dabei NICHT den index hardcoden (also einfach manuell abzählen und die richtige Zahl eintragen)
    // dazu machen wir uns .size zu nutze: wir wissen, in .size steht immer die tatsächliche länge
    // wir wissen auch: der Index ist immer genau 1 kleiner als die länge
    // bedeutet: wir koönnen, um immer an den letzten Index zu gelangen, .size-1 nutzen:
    var lastFirstName: String = firstNameList[firstNameList.size-1]

    // mit hilfsvariable:
    var sizeLastNameList: Int = lastNameList.size
    var lastLastName: String = lastNameList[sizeLastNameList-1]




    // isEmpty: gibt true zurück, wenn die Liste leer ist.
    println("FirstNameList leer? -> ${firstNameList.isEmpty()}") // false
    println("Leere Liste leer? -> ${emptyList.isEmpty()}") // true
    // Gegenteil: isNotEmpty: gibt true zurück, wenn die Liste NICHT leer ist
    println("LastNameList NICHT leer? -> ${lastNameList.isNotEmpty()}")

    // get: Alternative zum Index
    var hermineMitGet: String = firstNameList.get(2) // Hermine mit get aus der Liste geschält
    var hermineOhneGet: String = firstNameList[2]

    // contains: true, wenn das exakt gleiche (also auch gleich geschriebene) Element vorhanden ist
    val lunaInList: Boolean = firstNameList.contains("Luna")
    println("Ist Luna in der Liste? -> $lunaInList")

    // wie kann man die gross und kleinschreibung umgehen? -> lowercase() und uppercase()
    val ron: String = firstNameList[1] // Ron
    val ronLowerCase: String = ron.lowercase() // ron

    // variable rausschälen, klein schreiben in 1 Schritt ohne Hilfsvariable:
    val ronLowerCaseNoVar: String = firstNameList[1].lowercase()
    val ronInList: Boolean = firstNameList.contains("ron")

    // sublist: gibt uns eine Liste mit Elementen von fromIndex bis AUSschliesslich dem toIndex zurück.
    val firstThreeNames: List<String> = firstNameList.subList(0,3) // die 3 ist EXklusive und nicht mit enthalten, obere Grenze
    println(firstThreeNames)


    // reversed: gibt uns eine Kopie der Liste in umgekehrter Reihenfolge zurück
    val reversedFirstNames: List<String> = firstNameList.reversed()
    println("Umgekehrte Namensliste: $reversedFirstNames")

    // sorted: gibt uns eine Kopie der Liste in sortierter Reihenfolge zurück
    val sortedFirstnames: List<String> = firstNameList.sorted()
    val sortedNumbers: List<Int> = numbersList.sorted()
    println("Sortierte Namensliste: $sortedFirstnames")
    println("Sortierte Numbersliste: $sortedNumbers")







}