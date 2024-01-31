package VORLESUNG.Woche05.Tag23

val DRINKS = mutableMapOf<String, Boolean>(
    "Wein" to true,
    "Bier" to true,
    "Saft" to false,
    "Gift" to true,
    "Milch" to false,
    "Schnaps" to true,
    "Wasser" to false
)
fun main() {

    val animals: List<String> = listOf("Tiger", "Löwe", "Gepard", "Tiger", "Maus", "Leopard", "Tiger")
    // continue beispiel: tiere drucken, die keine tiger sind

    // alle animals durch gehen
    // schauen, ob sie tiger sind
    // wenn ja: NICHT druch

    for (animal in animals){
        if (animal == "Tiger"){
            continue // springt an den Anfang der Schleife zurück, ohne den Rest auszuführen
        } else {
            println("Das Tier $animal ist kein Tiger! Deshalb drucken wir.")
        }
    }





}


