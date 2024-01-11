package vorlesungen.Woche02

fun main(){

// Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt

    var animalList: MutableList<String> = mutableListOf("Tiger","Igel","Rabe","Bär")
    println(animalList)

    // set anlegen
    var animalSet: Set<String> = setOf("Tiger","Igel","Rabe","Bär")
    println(animalSet)


    // mutable machen
    var mutableSet: MutableSet<String> = animalSet.toMutableSet()


    // mehr duplikate hinzufügen
    animalList.add("Gorilla")
    animalList.add("Giraffe")
    animalList.add("Strauss")
    animalList.add("Löwe")
    animalList.add("Gorilla")
    animalList.add("Giraffe")
    animalList.add("Tiger")
    animalList.add("Löwe")

    println(animalList)

    // nur nicht bereits vorhandene Elemente werden aufgenommen:
    mutableSet.add("Gorilla")
    mutableSet.add("Giraffe")
    mutableSet.add("Strauss")
    mutableSet.add("Löwe")
    mutableSet.add("Gorilla")
    mutableSet.add("Giraffe")
    mutableSet.add("Tiger")
    mutableSet.add("Löwe")
    println(mutableSet)



    // set zur mutable liste konvertieren
    var mutableAnimals: MutableList<String> = mutableSet.toMutableList()
    println(mutableAnimals)


    // liste mit duplikaten zu set konvertieren: animalList zum Set machen
    var listToSet: MutableSet<String> = animalList.toMutableSet()
    println(listToSet)



    // size: enthält bei set die duplikate nicht
    println(listToSet.size)


    // Sinn von Sets
    // Daten aus verschiedenen Quellen, in denen Doppelungen vorkommen
    val source1 = listOf("A","B","C","D")
    val source2 = listOf("E","F","G","D")
    val source3 = listOf("B","H","I","A")
    val source4 = listOf("J","K","L","I")


    // Eine leere Menge (Set) erstellen, um eindeutige Datensätze zu speichern
    val uniqueData: MutableSet<String> = mutableSetOf()
    println(uniqueData)

    // liste an sources
    val srcList: List<List<String>> = listOf(source1,source2,source3,source4)

    // nicht möglich: Liste an Listen mit addAll oder toSet zu nutzen, ist zu tief geschachtelt...
    // uniqueData.addAll(srcList)
    // val uniqueFromList: Set<String> = srcList.toSet()

    // Daten aus verschiedenen Quellen zusammenführen, Doppelungen werden nicht hinzugefügt
    uniqueData.addAll(source1)
    uniqueData.addAll(source2)
    uniqueData.addAll(source3)
    uniqueData.addAll(source4)




    // Eindeutige Datensätze anzeigen
    println(uniqueData)

    // auf Element im Set zugreifen, Sets haben keinen Index, deshalb geht [] nicht!
    // var firstAnimal: String = listToSet[0]
    var firstAnimal: String = listToSet.elementAt(0)

    // set reversen: gibt eine Kopie als Liste zurück
    var reversedSetToList: List<String> = listToSet.reversed()

    listToSet.add("Zebra")
    listToSet.remove("Tiger")
    listToSet.clear() // leer das gesamte Set aus, ist jetzt leer


}