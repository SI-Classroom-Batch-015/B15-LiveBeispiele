package vorlesungen.woche06.Tag05.Fahrzeuge

class Fahrzeugverleih(name: String) {

    private var alleFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
    private var alleLandFahrzeuge: MutableList<Landfahrzeug> = mutableListOf()
    private var alleWasserFahrzeuge: MutableList<Wasserfahrzeug> = mutableListOf()

    // init Block: beim Initialisieren, also sobald der Verleih erstellt wird, soll die alleFahrzeuge Liste mit Ware befuellt werden.
    init {
        alleFahrzeuge.addAll(
            mutableListOf(
                Fahrzeug("BMW"),
                Wasserfahrzeug("Schiff",90,800.0),
                Wasserfahrzeug("Kreuzfahrtschiff"),
                Landfahrzeug("Buggy"),
                Landfahrzeug("Bus"),
                Motorrad("Roller"),
                Motorrad("Dukati"),
                Motorrad("Yamaha"),
                PKW("Familienwagen",100.0),
                PKW("Toyota Auto",40.0),
                PKW("Smart",20.0),
                Yacht("Spirit of the Sun"),
                Yacht("Sea Lion",99,450.0),
                Segelboot("Sailor's Dream"),
                Segelboot("Ship's Fate")
            )
        )

        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug is Landfahrzeug){
                alleLandFahrzeuge.add(fahrzeug)
            } else if (fahrzeug is Wasserfahrzeug){
                alleWasserFahrzeuge.add(fahrzeug)
            }
        }

        // alle Landfahrzeuge rausfiltern
        var tempListe: MutableList<Fahrzeug> = alleFahrzeuge.filter { it is Landfahrzeug }.toMutableList()
        // kuerzere Alternative (von der IDE vorgeschlagen): alleFahrzeuge..filterIsInstance<Landfahrzeug>().toMutableList()


        alleFahrzeuge.map { it is Landfahrzeug }
        // alleLandFahrzeuge.addAll(tempListe)
    }

    fun getAlleFahrzeuge(): MutableList<Fahrzeug> {
        return alleFahrzeuge
    }

    fun getAlleLandFahrzeuge(): MutableList<Fahrzeug> {
        // alleFahrzeuge besteht aus Fahrzeugen. nicht Landfahrzeugen.
        // Deshalb ist return datentyp eine Liste an Fahrzeugen
        return alleFahrzeuge.filter { it is Landfahrzeug }.toMutableList()
    }

    fun getAlleWasserFahrzeuge(): MutableList<Wasserfahrzeug> {
        var tempList = mutableListOf<Wasserfahrzeug>()
        var i = 0
        while (i < alleFahrzeuge.size){
            if (alleFahrzeuge[i] is Wasserfahrzeug){
                tempList.add(alleFahrzeuge[i] as Wasserfahrzeug)
            }
            i++

        }
        return tempList
    }


    fun addFahrzeug(newFahrzeug: Fahrzeug){
        alleFahrzeuge.add(newFahrzeug)

        if (newFahrzeug is Landfahrzeug){
            alleLandFahrzeuge.add(newFahrzeug)
        } else if (newFahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.add(newFahrzeug)
        }
    }

    fun removeFahrzeug(removeFahrzeug: Fahrzeug){
        alleFahrzeuge.remove(removeFahrzeug)

        if (removeFahrzeug is Landfahrzeug){
            alleLandFahrzeuge.remove(removeFahrzeug)
        } else if (removeFahrzeug is Wasserfahrzeug){
            alleWasserFahrzeuge.remove(removeFahrzeug)
        }
    }

    fun removeString(removeName: String){
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug.bezeichner == removeName){
                alleFahrzeuge.remove(fahrzeug)
                break
            }
        }
        for (fahrzeug in alleWasserFahrzeuge){
            if (fahrzeug.bezeichner == removeName){
                alleWasserFahrzeuge.remove(fahrzeug)
                break
            }
        }

        for (fahrzeug in alleLandFahrzeuge){
            if (fahrzeug.bezeichner == removeName){
                alleLandFahrzeuge.remove(fahrzeug)
                break
            }
        }
    }

    fun vermieten(fahrzeug: Fahrzeug){
        println("Das Fahrzeug ${fahrzeug.bezeichner} wird ausgeliehen...")
        fahrzeug.isVermietet = true
    }

    fun zurueckGeben(fahrzeug: Fahrzeug){
        println("Das Fahrzeug ${fahrzeug.bezeichner} wird zurück gegeben...")
        fahrzeug.isVermietet = false
    }

    fun getVermieteteFahrzeuge(): MutableList<Fahrzeug> {
        var vermieteteFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug.isVermietet){
                vermieteteFahrzeuge.add(fahrzeug)
            }
        }
        return vermieteteFahrzeuge
        // ODER
        //return alleFahrzeuge.filter { it.isVermietet }.toMutableList()
    }

    fun getVerfuegbareFahrzeuge(): MutableList<Fahrzeug> {
        var verfuegbareFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
        for (fahrzeug in alleFahrzeuge){
            if (!fahrzeug.isVermietet){
                verfuegbareFahrzeuge.add(fahrzeug)
            }
        }
        return verfuegbareFahrzeuge
        // ODER
        //return alleFahrzeuge.filter { !it.isVermietet }.toMutableList()
    }

}


fun main() {
    var verleih: Fahrzeugverleih = Fahrzeugverleih("Meyer's Fahrzeugwelt")
    var alleWasser = verleih.getAlleWasserFahrzeuge()
   // println(alleWasser)

    verleih.addFahrzeug(Wasserfahrzeug("Sea King"))

    // VORSICHT: hier ein neues Fahrzeug reinschreiben bringt nichts, da ein neues Objekt erstellt wird und dann nicht das bereits existierende entfernt wird.
    verleih.removeFahrzeug(verleih.getAlleFahrzeuge().filter { it.bezeichner == "Buggy" }.first())

    verleih.removeString("Buggy")
    println(verleih.getAlleFahrzeuge())
    println(verleih.getAlleLandFahrzeuge())

    verleih.getAlleWasserFahrzeuge().first().isVermietet // false



}