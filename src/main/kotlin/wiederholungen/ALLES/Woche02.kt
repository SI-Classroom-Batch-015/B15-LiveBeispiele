package wiederholungen.ALLES

fun main() {
    // liste anlegen
    var dogList: List<String> = listOf("Pudel","Dackel","Maltese","Mops","Beagle")
    println(dogList)

    // mutable machen
    val mutableDogList: MutableList<String> = dogList.toMutableList()

    mutableDogList.add("Labrador")


    // daten aus liste per index holen: 1. Hund, also Pudel, rausholen:
    var pudel = dogList[0]

    // letztes element rausholen, ohne IndexOutOfBounds zu riskieren: immer size-1


    // hinzufuegen, loeschen
    mutableDogList.add("Schäferhund")
    mutableDogList.removeAt(2) // Maltese raus
    mutableDogList.remove("Mops")
    var letzterHund = dogList[dogList.size-1]

    // ganze liste ausleeren:
    mutableDogList.clear()



    // map anlegen: Produkte mit Preisen
    val productMap: Map<String,Double> = mutableMapOf(
        "Zahnpasta" to 2.99,
        "Puderzucker" to 1.49,
        "Wasser" to 0.49
    )
    println(productMap)

    for (dog in dogList){ }

    // Gesamtpreis ausrechnen
    var result: Double = 0.0
    for((name,price) in productMap){
        result += price
    }
    println(result)

    var resultLambda: Double = 0.0
    productMap.forEach { (name,price) -> resultLambda+= price }
    println(resultLambda)



    // daten per key rausholen

    // hinzufuegen, ueberschreiben, loeschen


}