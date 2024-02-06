class Mitarbeiter
    (
    var id: Int,
    var name: String,
    var gehalt: Int,
    var artDerBeschaeftigung: String,
    var elternZeit: Boolean
) {
    fun gehaltAusgeben() {
        println("$name verdient $gehalt.")
    }

    fun befoerdern() {
        gehalt += 1500
    }

    fun istVerfuegbar() {
        if (elternZeit) {
            println("Mitarbeiter ist nicht verfügbar")
        } else {
            println("Mitarbeiter ist verfügbar")
        }
    }

}