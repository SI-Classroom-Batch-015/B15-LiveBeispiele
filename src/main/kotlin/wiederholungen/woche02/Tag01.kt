package wiederholungen.Woche02

fun main(){

    //Aufgabe 1:
    var numbersFromOneToTen: List<Int> = listOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
    )

    //a) Printe die Zahl 1
    println(numbersFromOneToTen[0])//println(NameDerListenVariable[Index])
    //b) Printe die Zahl 7
    println(numbersFromOneToTen[7-1])//der korrekte Index kann auch durch Rechenoperation ermittelt werden
    //c) Printe die Zahl 10
    println(numbersFromOneToTen[9])
    //d) Printe die Länge der Liste
    println(numbersFromOneToTen.size)//wie die Funktion .length, die wir schon kennen
    //Printed die Liste umgekehrt aus
    println(numbersFromOneToTen.reversed())



    //Aufgabe 2:
    //Erstelle eine nicht veränderliche Liste aus Strings mit "Erdbeeren", "Kartoffeln", "Chips", "Spülmittel"
    val shoppingList: List<String> = listOf("Erdbeeren", "Kartoffeln", "Chips", "Spülmittel")
    //diese Liste kann NICHT bearbeitet werden



    //Aufgabe 3:
    //Erstelle jetzt die Liste aus Aufgabe 2 als veränderbare Liste
    //Lösungsansatz 1: Eintippen derselben Strings wie in Aufgabe 2
    var shoppingListMutableList: MutableList<String> = mutableListOf("Erdbeeren", "Kartoffeln", "Chips", "Spülmittel")
    println(shoppingListMutableList)

    //Lösungsansatz 2: Datentypkonvertierung der shoppingList aus Aufgabe 2 durch .toMutableList()
    var shoppingListMutableList2: MutableList<String> = shoppingList.toMutableList()
    println(shoppingListMutableList2)


    //a) Füge "Nudeln" hinzu
    //Lösungsansatz 1: neue Variable erstellen und durch "Rechenoperation" + "Nudeln" hinzufügen
    //Achtung: hier entsteht eine neue Variable
    var shoppingListMutableList3 = shoppingList + "Nudeln"
    println(shoppingListMutableList3)

    //Lösungsansatz 2: Ähnlich wie Lösungsansatz 1, nur die Liste wird nicht in einer Variable gespeichert, sondern "nur" geprinted
    println(shoppingList + "Nudeln")

    //Lösungsansatz 3: die bestehende Variable shoppingListMutableList wird durch Listenfunktion .add() bearbeitet
    //Achtung: hier entsteht KEINE neue Variable
    shoppingListMutableList.add("Nudeln") //fügt "Nudeln" am Ende der Liste hinzu
    println(shoppingListMutableList)

    //b) Füge "Schokolade" am Anfang der Liste hinzu
    shoppingListMutableList.add(0, "Schokolade")//fügt "Schokolade" am Anfang der Liste hinzu
    println(shoppingListMutableList)

    //c) Entferne "Spülmittel"
    shoppingListMutableList.remove("Spülmittel")//entfernt ein bestimmtes Element
    println(shoppingListMutableList)

    //d) Entferne das 2. Element der Liste
    shoppingListMutableList.removeAt(1)//entfernt ein Element an einem bestimmten Index
    println(shoppingListMutableList)

    //e) Printe das vorletzte Element der Liste an
    println(shoppingListMutableList[shoppingListMutableList.size-2])
    //natürlich kann man hier auch den entsprechenden Index raussuchen
    //z.B. bei [Schokolade, Kartoffel] -> shoppingListMutableList[0]
    //Aber dazu müsste man wissen, wie groß die Liste ist
    //durch shoppingListMutableList.size-2 kann man den vorletzten Index errechnen, egal wie groß die Liste ist

    //f) Entferne mehrere Elemente
    shoppingListMutableList.removeAll(listOf("Nudeln", "Chips"))//entfernt mehrere Elemente




}