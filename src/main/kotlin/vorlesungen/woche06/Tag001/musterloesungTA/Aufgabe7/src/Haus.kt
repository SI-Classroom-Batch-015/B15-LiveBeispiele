class Haus(
    var lampen: List<Lampe>
) {
    fun status() {
        for (lampe in lampen) {
            println("Die Lampe Nr. ${lampen.indexOf(lampe) + 1} im Raum ${lampe.location} ist gerade ${if (lampe.isOn) "an" else "aus"} und hat die Farbe ${lampe.color}")
        }
    }

    fun turnOnRoom(location: String, turnAllOthersOff: Boolean) {
        for (lampe in lampen) {
            if (lampe.location == location) lampe.switchOnOff()
            else if (lampe.isOn && turnAllOthersOff) lampe.switchOnOff()
        }
    }

    fun changeColorRoom(location: String, color: String) {
        for (lampe in lampen) {
            if (lampe.location == location) lampe.color = color
        }
    }

    fun statusLocation(location: String) {
        for (lampe in lampen) {
            if (lampe.location == location) {
                println("Die Lampe Nr. ${lampen.indexOf(lampe) + 1} im Raum ${lampe.location} ist gerade ${if (lampe.isOn) "an" else "aus"} und hat die Farbe ${lampe.color}")
            }
        }
    }
}