fun main() {
    // Ihr Code
}

val trees = mapOf<Int, String>(
    1000 to "Eiche",
    1010 to "Buche",
    1020 to "Birke",
    1030 to "Weide",
    1040 to "Ahorn",
    2000 to "Tanne",
    2010 to "Kiefer",
    2020 to "Elbe",
    2030 to "Konifere",
    2040 to "Wachholder"
)

/**
 * Diese Funktion gibt die Art eines Baumes basierend auf seiner Baumnummer zurück.
 *
 * @param treeNr Die eindeutige Baumnummer des Baums.
 * @return Die Art des Baums als Zeichenkette ("Nadelbaum" oder "Laubbaum").
 */
fun getTreeKind(treeNr: Int): String {
    // Ihr Code
    TODO()
}

/**
 * Diese Funktion gibt Informationen über einen Baum aus, einschließlich seiner Baumnummer,
 * seiner Bezeichnung und seiner Eignung für den Park.
 *
 * @param treeNr Die eindeutige Baumnummer des Baums.
 * @throws Exception Wenn die Baumnummer nicht in der Baum-Datenbank enthalten ist.
 */
fun treeOutput(treeNr: Int) {
    // Ihr Code
}

/**
 * Diese Funktion überprüft, ob ein Baum vom Typ "Nadelbaum" ist und somit für den Park geeignet ist.
 *
 * @param treeKind Die Art des Baums als Zeichenkette.
 * @return true, wenn der Baum ein "Nadelbaum" ist, andernfalls false.
 */
fun isValid(treeKind: String): Boolean {
    // Ihr Code
    TODO()
}