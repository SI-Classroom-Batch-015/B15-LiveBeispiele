package VORLESUNG.Woche05.Tag22


fun main() {
    // Animal beispiel: for in schleife / for each schleife
    var animalList = mutableListOf("Tiger", "Löwe", "Bär", "Maus")

    // for listenElementName (an dieser stelle wird name der "Laufvariable" entschieden) in listenName
    //forAnimals(animalList)


    // for mit einer Map
    var clothesMap: Map<String,Double> = mutableMapOf(
        "Jacke" to 29.99,
        "Hose" to 19.99,
        "Schal" to 9.99
    )

//    // sobald ich for schreibe, entscheide ich, wie meine variablen heissen sollen
//    for ((name,price) in clothesMap){
//        println("Artikel: $name, Preis: $price")
//    }

    // 1. Liste an Sorten, die zufällig 100x in unsere Bestellung eingeordnet werden sollen
    var pizzaSorten = mutableListOf("Hawaii","Tonno","Mozarella")
    // 2. leere Liste für die Bestellung, in die 100 Pizzen kommen sollen
    var orderList = mutableListOf<String>()

    // 3. for Schleife, die 100 x läuft
    // Schleife läuft 100x durch
    for (i in 1..100){
        // befehl, der unserer am Anfang leeren Bestellung bei jedem der 100 Durchläufe eine zufällige von 3 Pizzen in pizzaSorten hinzufuegt.
        orderList.add(pizzaSorten.random())
    }
    println(orderList)

    countPizzaType("Tonno",orderList)
    countPizzaType("Hawaii",orderList)
    println("Bitte Pizzanamen eingeben:")
    countPizzaType(readln(),orderList)
}

fun countPizzaType(pizzaType: String, orderList: MutableList<String>) {
    // countPizzaType: wir haben eine orderListe an 100 Pizzen und wollen zählen, wie oft "Hawaii" vorkommt.
    var counter = 0
    for (pizza in orderList){
        // pruefen, ob Pizza Hawaii ist
        if (pizza == pizzaType){
            counter++
        }
    }
    println("Die Pizza $pizzaType kommt $counter mal in der Bestellung vor.")

}

fun forAnimals(animalList: MutableList<String>) {
    for (animal in animalList) {
        println(animal) // Tiger
        // nicht möglich: animal = "Neues Tier", animal ist immer eine Konstante
//        println(animal) // Tiger
//        println(animal) // Tiger
        if (animal == "Tiger") {
            println("Das Tier war ein Tiger!")
        } else if (animal == "Maus") {
            println("Wir sind beim letzten Tier, der Maus, angelangt!")
        }
        printAnimalInfo(animal)
    }
}

fun printAnimalInfo(animal: String) {
    println("Besondere Daten zu dem Tier namens $animal")
    if (animal == "Tiger"){
        println("Gewicht: 300kg")
        println("Farbe: gestreift")
    } else if (animal == "Maus") {
        println("Gewicht: 500g")
        println("Farbe: grau")
    } else {
        println("Tier namens $animal hat keine Daten hinterlegt...")
    }

}
