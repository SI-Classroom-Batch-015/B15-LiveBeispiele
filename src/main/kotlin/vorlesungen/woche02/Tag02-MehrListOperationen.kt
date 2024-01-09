package vorlesungen.Woche02

fun main() {

     // liste anlegen: ShoppingList
    val shoppingList: List<String> = listOf("Apfel", "Banane", "Brokkoli", "Kuchen", "Kekse", "Kaffee", "Tee", "Aal")


     // letztes Element: 3 Varianten
    var tee: String = shoppingList[shoppingList.size-1]
     // alternative zum Inhalt des letzten index: last()
    var tee2: String = shoppingList.last()
     // 2. alternative: get
    var tee3: String = shoppingList.get(shoppingList.lastIndex) // lastIndex = beinhaltet den letzten Index, also das gleiche wie size-1

    // erstes Element: 2 Varianten
    var apfel: String = shoppingList[0]
    // alternative zum Inhalt des ersten index: first()
    var apfel2: String = shoppingList.first()
    var apfel3: String = shoppingList.get(0)



     // liste in mutable (veränderbare) liste umwandeln, in neuer variable speichern:
    val mutableShoppingList: MutableList<String> = shoppingList.toMutableList()


    // shoppingList.add() // geht immernoch nicht, shoppingList wird nicht bearbeitet, es wird nur eine mutable Kopie davon zurueckgegeben.
    mutableShoppingList.add("Milch")
    println(mutableShoppingList)



    // LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS
     println("---Schreibende Operationen: auf List und MutableList---")



    // size, also Länge der Liste, in variable speichern
    var shoppingSize: Int = shoppingList.size
    println(shoppingSize)

    val intList: List<Int> = listOf(2,4,55,88,33,20,0)

    // min: gibt "kleinstes" Element raus
    val min: String = shoppingList.min()
    val minInt: Int = intList.min()


    // max gibt "größtes" Element raus
    val max: String = shoppingList.max()
    val maxInt: Int = intList.max()

    println("Min: $min, Max: $max")

    // indexOf() - erstes Vorkommen eines Elements in der Liste
    // Vorbereitung: Ein Element doppelt in die Liste fügen
    mutableShoppingList.add("Kuchen")
    println(mutableShoppingList)
    var kuchenIndex: Int = mutableShoppingList.indexOf("Kuchen") // 3

    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste
    var lastKuchenIndex: Int = mutableShoppingList.lastIndexOf("Kuchen") // 9

    // contains: gibt true zurück, wenn das gesuchte Element in der Liste ist
    val isMilkInList: Boolean = shoppingList.contains("Milch") // true

    // containsAll : siehe contains, aber: nicht ein einzelnes Element, sondern ganze Liste
    val searchedElements: List<String> = listOf("Apfel","Birne","Kuchen")
    val containsMilkTeaApple: Boolean = shoppingList.containsAll(listOf("Apfel","Milch","Tee"))
    val containsApplePearCake: Boolean = shoppingList.containsAll(searchedElements)

    println("Sind in der Liste Kuchen, Apfel und Birne? -> $containsApplePearCake")
    println("Sind in der Liste Apfel, Milch und Tee? -> $containsMilkTeaApple")


    // subList: gibt liste vom 1. index in den Klammern bis AUSschliesslich den 2. Index aus
    println("Sublist: ")
    val lastThreeItems: List<String> = shoppingList.subList(shoppingList.lastIndex-2,shoppingList.size)
    println(lastThreeItems)



    // slice: kann eine Int Range (x..y) übergeben bekommen, das obere Ende der Range ist INklusive EINbegriffen (nicht wie bei subList)
    println("Slice mit IntRange:")
    // Beispiel für eine IntRange:
    var intRange: IntRange = 1..100
    var sliced: List<String> = shoppingList.slice(2..5)
    println(sliced)
    println("Inhalt der IntRange: " + intRange.toList())


    // reversed: erstellt eine Kopie der shoppingList, kehrt darin die Reihenfolge um
    println("Reversed:")
    var reversedShoppingList: List<String> = shoppingList.reversed()
    println(reversedShoppingList)

    // shuffled: erstellt eine Kopie der shoppingList, mischt sie durch
    println("Shuffled:")
    var shuffledShoppingList: List<String> = shoppingList.shuffled()
    println(shuffledShoppingList)


    println("Sorted: ")
    var sortedShoppingList: List<String> = shoppingList.sorted()
    println(sortedShoppingList)



// SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS
   println("---Schreibende Operationen: nur mit MutableList---")


    // remove: entfernt das 1. vorkommende, passende Element (nicht mehrere, falls mehrere passen)
    println("Remove:")
    println("Vorher: $mutableShoppingList")
    // Element entfernen
    mutableShoppingList.remove("Banane")
    println("Nachher:")
    println(mutableShoppingList)

    // addAll: fügt ganze Liste an Elementen hinzu
    mutableShoppingList.add("Marmelade") // nur 1 Element hinzufügen
    println(mutableShoppingList)
    mutableShoppingList.addAll(listOf("Monte","Sojamilch","Tofu","Bulgur"))
    println(mutableShoppingList)



    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter. hiermit können doppelt vorkommende Elemente entfernt werden.
    println("RemoveAll:")
    mutableShoppingList.removeAll(listOf("Aal","Kirsche","Monte"))
    println(mutableShoppingList)

    // add: ohne Index, fügt ein Element am Ende der Liste hinzu
    println("Add:")
    mutableShoppingList.add("Nutella")


    // add: mit Index: fügt ein Element am gegebenem Index  hinzu
    println("Add mit Index:")
    mutableShoppingList.add(4,"Corn Flakes")
    // Element wird an die 4. Stelle geschrieben:
    println(mutableShoppingList)
    println(mutableShoppingList[4])


    // clear: leert Liste komplett aus
    println("Clear:")
    mutableShoppingList.clear()
    // mutableShoppingList = mutableListOf() // wuerde das gleiche machen aber mit val nicht erlaubt
    println(mutableShoppingList)

    // addAll: fügt neue Liste in Liste ein

    println("AddAll:")
    val newShoppingList: List<String> = listOf("Eier", "Mehl", "Milch", "Butter", "Puderzucker")
    mutableShoppingList.addAll(newShoppingList)
    println(mutableShoppingList)

    println("RemoveAt 0")
    // removeAt: entfernt Element an spezifischen Index
    mutableShoppingList.removeAt(0)
    println(mutableShoppingList)

    println("RemoveAt last Index")
    mutableShoppingList.removeAt(mutableShoppingList.size-1) // lastIndex ginge auch
    println(mutableShoppingList)

    // removeLast: entfernt das letzte Element aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove Last:")
    mutableShoppingList.removeLast() // Butter raus
    println(mutableShoppingList)

    // removeFirst: entfernt das 1. Element (index 0) aus der Liste, gibt es zurück = es kann in eine Variable gespeichert werden
    println("Remove First:")
    mutableShoppingList.removeFirst() // Mehl raus

    println(mutableShoppingList)

    mutableShoppingList.addAll(newShoppingList)
    mutableShoppingList.addAll(shoppingList)
    println(mutableShoppingList)

    // shuffle: mischt liste durch
    println("Shuffle:")
    mutableShoppingList.shuffle()
    println(mutableShoppingList)

    // sort: sortiert ORGINALE liste aufsteigend, es wird keine Kopie erstellt, die urspruengliche liste wird sortiert
    println("Sort:")
    mutableShoppingList.sort()
    println(mutableShoppingList)


    // reverse: dreht reihenfolge um
    println("Reverse:")
    mutableShoppingList.reverse()
    println(mutableShoppingList)


}