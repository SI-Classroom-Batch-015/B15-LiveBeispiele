package VORLESUNG.Woche05.Tag24

fun main() {
    val fischSorten: List<String> = listOf("giftiger Kugelfisch", "Hering", "Barsch", "Lachs", "Dose")

    // Fisch Aufgabe mit do while
    fishDoWhile(fischSorten)

    println("---")

    // Fisch aufgabe mit for
    fishFor(fischSorten)

}

fun fishFor(fischSorten: List<String>) {
    val caught: MutableList<String> = mutableListOf()

     for (i in 1..20){
        var nextFish: String = fischSorten.random()
        if (nextFish == "giftiger Kugelfisch"){
            println("$nextFish gefangen! Wird zurück ins Wasser geworfen...")
            // lässt uns den Rest der Schleife skippen, Schleife beginnt von vorne
            continue
        }
        if (nextFish == "Dose"){
            println("Igitt, eine Dose. Hier angeln wir nicht weiter.")
            // bricht die Schleife komplett ab
            break
        }
        caught.add(nextFish)

    }

    println(caught)


}


fun fishDoWhile(fischSorten: List<String>){
    val caught: MutableList<String> = mutableListOf()

    do {
        var nextFish: String = fischSorten.random()
        if (nextFish == "giftiger Kugelfisch"){
            println("$nextFish gefangen! Wird zurück ins Wasser geworfen...")
            // lässt uns den Rest der Schleife skippen, Schleife beginnt von vorne
            continue
        }
        if (nextFish == "Dose"){
            println("Igitt, eine Dose. Hier angeln wir nicht weiter.")
            // bricht die Schleife komplett ab
            break
        }
        caught.add(nextFish)

    } while (nextFish != "Dose")

    println(caught)

}