/**
 * Die Klasse 'Auto' repräsentiert ein Fahrzeug mit einer bestimmten Anzahl von Sitzen.
 *
 * @property farbe Die Farbe des Autos.
 * @property sitze Die Anzahl der Sitze im Auto.
 * @property fahrer Der Fahrer des Autos, wird zuerst auf null gesetzt.
 * @property passagiere Eine MutableList von Mitfahrenden im Auto, wird zuerst als leere Liste initialisiert.
 */
class Autoo(
    val farbe: String,
    val sitze: Int
) {
    var fahrer: Perrson? = null
    val passagiere: MutableList<Perrson> = mutableListOf()
}