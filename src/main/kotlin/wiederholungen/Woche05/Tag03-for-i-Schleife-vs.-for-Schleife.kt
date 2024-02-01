package wiederholungen.Woche05


fun main() {
    // Annahme: Du hast eine Liste von WhatsApp-Kontakten
    val whatsappKontakte: MutableList<String> = mutableListOf("Max", "Paula", "Ali")
    // for-i-Schleife zum Umbenennen der Kontakte
    //Für jeden Index in whatsappKontakte Indizes
    //i kann hier z.B. auch index oder anderes genannt werden, i ist aber üblich als Bezeichnung
    for (i in whatsappKontakte.indices) {
        //Aktualisiere den Kontakt zu "Name Syntax", Z.B. Paula + Syntax
        whatsappKontakte[i] = "${whatsappKontakte[i]} + Syntax"
    }


    // for-Schleife zur Ausgabe der aktualisierten Liste
    println("Aktualisierte WhatsApp-Kontakte:")
    //für jeden Kontakt in whatsappKontakte
    //i kann hier z.B. auch contacts oder anderes genannt werden, i ist aber üblich als Bezeichnung
    for (i in whatsappKontakte){
        //printe den Kontakt
        println(i)
    }

    //ACHTUNG:
    // for-i arbeitet mit den !Indizes! einer Liste
    // for arbeitet mit den !Elementen! einer Liste
}
