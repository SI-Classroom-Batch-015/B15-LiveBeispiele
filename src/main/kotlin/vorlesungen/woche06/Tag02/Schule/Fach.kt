package vorlesungen.woche06.Tag02.Schule
class Fach(
    var name: String, var fachlehrer: String,
    var raumnummer: String, var pruefungen: MutableList<String>) {


    fun addPruefung(pruefung: String) {
        pruefungen.add(pruefung)
    }
}