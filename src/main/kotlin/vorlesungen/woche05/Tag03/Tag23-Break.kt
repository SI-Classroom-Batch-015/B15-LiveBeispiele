package VORLESUNG.Woche05.Tag23
fun main() {
    // Break mit Liste
    val animals: List<String> = listOf("Tiger", "Löwe", "Gepard", "Maus", "Leopard", "weißer Tiger")

    // findMouseInList mit for Schleife in Funktion
    //findAnimalInList(animals, "Gepard")
    //findAnimalInList(animals, "Maus")
    findAnimalInList(animals, "Löwe")
    findAnimalInList(animals, "Zebra")


    // Break mit Map: selbes Prinzip, aber gesteigerte Komplexität
    val animalMap = mapOf(
        "Gepard" to false,
        "Tiger" to true,
        "Maus" to false,
        "Löwe" to true,
        "Leopard" to true,
    )
    println("-------")

    //findMouseInMap(animalMap)

    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    // Sieben Finden, danach Schleife abbrechen
    //findSeven(numbers)

    println("-------")

    // Schachbrett mit geschachtelter Schleife

}

fun findAnimalInList(list: List<String>, gesuchtesTier: String) {
    var animalFound = false

    // 1. Schleife, um jedes Element anzuschauen
    for (element in list){
        // 2. ist das Element das gesuchte Tier?
        if (element == gesuchtesTier){
            println("$gesuchtesTier gefunden! Schleife abbrechen...")
            animalFound = true
            break // bricht die Schleife und damit in diesem Fall die ganze Funktion ab.

        }
        else{
            println("$gesuchtesTier nicht gefunden, sondern $element. Weiter geht die Suche...")
        }
    }
    if (!animalFound) println("$gesuchtesTier exisitiert nicht in dieser Liste! :(")
}


