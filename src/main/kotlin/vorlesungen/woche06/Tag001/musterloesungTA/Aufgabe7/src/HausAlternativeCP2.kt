package vorlesungen.woche06.Tag001.musterloesungTA.Aufgabe7.src

import Lampe

class HausAlternativeCP2(
    var lampen: List<Lampe>
) {

    // implementiere die Funktion status, mit der für jede Lampe beispielsweise folgende Konsolenausgabe gemacht werden soll: Die Lampe Nr. 1 im Raum Schlafzimmer ist gerade an und hat die Farbe warmes Gelb
    fun status() {
        var i = 1
        lampen.forEach {
            println("Die Lampe Nr. $i  im Raum ${it.location} ist gerade ${ if (it.isOn) "an" else "aus"  } und hat die Farbe  ${it.color}")
            i++
        }

    }

    // implementiere die Funktion turnOnRoom, mit der alle Lampen innerhalb der location aus dem Parameter eingeschaltet werden sollen. Wenn der Parameter turnAllOthersOff true ist sollen alle Lampen, die nicht in diesem Raum sind ausgeschalten werden andernfalls bleiben diese an.
    fun turnOnRoom(location: String, turnAllOthersOff: Boolean) {
        // 1. alle Lampen innerhalb von location filtern
        var locationLampen = lampen.filter { it.location == location }

        //2.  alle Lampen innerhalb der location einschalten:
            // 2.1 alle, die bereits an sind, rausfiltern, also nicht mehr betrachten
            var offLampen: List<Lampe> = locationLampen.filter { !it.isOn }

            // 2.2 alle lampen, die ausgeschaltet sind, einschalten
            offLampen.forEach { it.switchOnOff() }


        // Wenn der Parameter turnAllOthersOff true ist sollen alle Lampen, die nicht in diesem Raum sind ausgeschalten werden andernfalls bleiben diese an.

        if (turnAllOthersOff){
            lampen.filter { it.location != location }.filter { it.isOn }.forEach { it.switchOnOff() }
        }
    }

    fun changeColorRoom(location: String, color: String) {


    }

    fun statusLocation(location: String) {


    }
}