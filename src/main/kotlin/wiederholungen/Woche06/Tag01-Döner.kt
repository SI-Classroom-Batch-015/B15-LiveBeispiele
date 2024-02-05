package wiederholungen.Woche06

//Klasse Döner mit Eigenschaften
//mengeFleisch mit defaultwert 1.0 (wird gespeichert, wenn keine Eingabe erfolgt)
//Beilagen mit defaultwert ""
//Sauce mit defaultwert ""
class Döner (var mengeFleisch: Double =1.0,
             var beilagen: String = "",
             var sauce: String = "" ) {

    //Methode/Funktion AuswahlFleischmenge
    fun auswahlFleischmenge(){
        //Kunde wird gefragt, wie viel Fleisch in den Döner soll
        println("Wie viel Fleisch möchtest du haben? 0.0, 0.5, 1.0 oder 2.0")
        //Auswahl wird in Variable abgespeichert
        var auswahl = readln().toDouble()
        //Klasseneigenschaft mengeFleisch wird mit Auswahl aktualisiert
        mengeFleisch = auswahl
    }

    //Methoden auswahlBeilagen und auswahlSauce analog zu auswahlFleischmenge
    fun auswahlBeilagen(){
        println("Welche Beilagen möchtest du haben? Es gibt Salat, Zwiebeln, Tomaten und Gurken")
        var auswahl = readln()
        beilagen = auswahl
    }

    fun auswahlSauce(){
        println("Welche Saucen möchtest du haben? Es gibt Cocktail, Tzaziki, Scharf")
        var auswahl = readln()
        sauce = auswahl
    }

}