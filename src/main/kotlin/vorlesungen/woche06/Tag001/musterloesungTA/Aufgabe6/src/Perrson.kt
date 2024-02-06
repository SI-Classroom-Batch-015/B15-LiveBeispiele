/**
 * Die Klasse 'Perrson' repräsentiert eine individuelle Person mit bestimmten Merkmalen.
 *
 * @property name Der Name der Person.
 * @property alter Das Alter der Person, als Boolean-Wert, der angibt, ob die Person erwachsen ist.
 * @property istErwachsen Eine Funktion, die das Erwachsensein der Person basierend auf dem Alter überprüft.
 *
 */
class Perrson(
    val name: String,
    val alter: Int
) {
    fun istErwachsen(): Boolean = alter >= 18
}