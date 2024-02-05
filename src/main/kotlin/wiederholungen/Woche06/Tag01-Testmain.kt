package wiederholungen.Woche06


fun main() {
    // Erstelle eine Einkaufsliste
    val einkaufsliste = Einkaufszettel()

    // Füge Produkte zur Liste hinzu
    einkaufsliste.produktHinzufügen("Milch", 2, 1.5)
    einkaufsliste.produktHinzufügen("Brot", 1, 2.0)
    einkaufsliste.produktHinzufügen("Eier", 12, 0.2)

    // Zeige die gesamte Einkaufsliste an
    println("Einkaufsliste:")
    einkaufsliste.zeigeListeAn()

    // Berechne den Gesamtpreis
    val gesamtPreis = einkaufsliste.berechneGesamtPreis()
    println("Gesamtpreis: $gesamtPreis €")



    //Döner-Beispiel von Andre
    //Objekt/Instanz 1
    var dönerKunde1 = Döner()
    //Objekt/Instanz 2
    var dönerKunde2 = Döner()
    dönerKunde1.auswahlFleischmenge()
    dönerKunde1.auswahlBeilagen()
    dönerKunde1.auswahlSauce()
    println("Kunde 1 möchte einen Döner mit ${dönerKunde1.mengeFleisch} Fleisch, ${dönerKunde1.beilagen} und ${dönerKunde1.sauce}")
    dönerKunde2.auswahlFleischmenge()
    dönerKunde2.auswahlBeilagen()
    dönerKunde2.auswahlSauce()
    println("Kunde 2 möchte einen Döner mit ${dönerKunde2.mengeFleisch} Fleisch, ${dönerKunde2.beilagen} und ${dönerKunde2.sauce}")
}