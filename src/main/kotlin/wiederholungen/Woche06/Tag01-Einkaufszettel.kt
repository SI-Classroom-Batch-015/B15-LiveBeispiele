package wiederholungen.Woche06

//Klasse Einkaufszettel x
class Einkaufszettel () {
    //Eigenschaft eine veränderbare Produktliste x
    var einkaufszettelListe = mutableListOf<Produkt>()


    //Methode/Funktion produktHinzufügen mit Parameter name, menge und preis
    fun produktHinzufügen(name: String, menge: Int, preis: Double) {
        //erstellen eines Objekts produkt mithilfe der Klasse Produkt und den Parametern
        var produktObjekt = Produkt(name, menge, preis)
        //Hinzufügen des Produkts zur Produktliste
        einkaufszettelListe.add(produktObjekt)
        //Konsolenausgabe mit Info wie viele von Produkt zu Einkaufsliste hinzugefügt wurden
        println("Du hast $menge von $name ausgewählt/hinzugefügt")
    }


    //Methoden/Funktion zeigeListeAn
    fun zeigeListeAn() {
        //alle Produkte sollen geprinted werden. Welche Schleife macht hier Sinn?
        for (produkt in einkaufszettelListe) {
            //println Produktmenge Produktname - Produktpreis €/Stück
            println("${produkt.menge} ${produkt.name} - ${produkt.preis} €/Stück")
        }
    }


    //Mehtoden/Funktion berechneGesamtPreis mit Preis als Rückgabewert
    fun berechneGesamtPreis(): Double {
        //Rückgabe Produktsumme (Hinweis Punktnotation und lambdas)
        return einkaufszettelListe.sumByDouble { it.menge * it.preis }
    }
}


