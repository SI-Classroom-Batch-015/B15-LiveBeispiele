package vorlesungen.woche06.Tag02.Schule
//
fun main() {
    val klasse1A = Klasse()
    klasse1A.name = "1A"
    klasse1A.klassenlehrer = "Frau Müller"

    val klasse2B = Klasse()
    klasse2B.name = "2B"
    klasse2B.klassenlehrer = "Herr Schmidt"

    val schule = Schule("Mustergrundschule","Musterstraße 123", mutableListOf(klasse1A,klasse2B))
    schule.name = "Mustergrundschule"
    schule.adresse = "Musterstraße 123"


    val schueler1 = Schueler(mutableListOf(),"Max", "Mustermann", "01.01.2010", "Musterweg 1")
    val schueler2 = Schueler(mutableListOf(), "Anna","Musterfrau", "02.02.2011", "Musterweg 2")

    val fachMathematik = Fach("Mathematik", "Herr Meier", "Raum 101", mutableListOf())
    val fachEnglisch = Fach("Englisch", "Frau Smith", "Raum 102", mutableListOf())


    schule.addKlasse(klasse1A)
    schule.addKlasse(klasse2B)

    klasse1A.addSchueler(schueler1)
    klasse2B.addSchueler(schueler2)

    schueler1.addFach(fachMathematik)
    schueler2.addFach(fachEnglisch)

    fachMathematik.addPruefung("Mathematik-Prüfung 1")
    fachEnglisch.addPruefung("Englisch-Prüfung 1")

    println("Schule: ${schule.name}, Adresse: ${schule.adresse}")
    println("Klassen in der Schule:")
    for (klasse in schule.klassen) {
        println("- Klasse: ${klasse.name}, Klassenlehrer: ${klasse.klassenlehrer}")
        for (schueler in klasse.schueler) {
            println("  - Schüler: ${schueler.vorname} ${schueler.nachname}, Geburtsdatum: ${schueler.geburtsdatum}")
            for (fach in schueler.faecher) {
                println("    - Fach: ${fach.name}, Fachlehrer: ${fach.fachlehrer}, Raum: ${fach.raumnummer}")
                for (pruefung in fach.pruefungen) {
                    println("      - Prüfung: $pruefung")
                }
            }
        }
    }
}