import java.lang.Exception
import java.lang.IllegalArgumentException

/*
Du programmierst ein Kassensystem, deine Kasse scannt ein Produkt und liefert dir eine Hexadezimal Zahl.
(Keine Sorge, du musst nicht wissen, was das ist). Die Hexadezimal steht nur für die ID des Produkts.

Diese Zahlen sind für Menschen nicht lesbar. Außerdem kann dein Kunde mit diesen Zahlen nichts anfangen! Dafür musst du eine Funktion programmieren,
die dir alle relevanten Daten mit der gegebenen Nummer aus deiner Datenbank holt.

Deine Datenbank ist die Liste filmArtikelNr.
Benutze die Liste filmArtikelNr um den Filmtitel mit getTitel(artikelNr: Int) zu bekommen, gib den Filmtitel dann mit println() aus.

Schreibe eine neue Funktion filmPreisByCode. Diese Funktion erwartet als Parameter eine der Hexadezimalzahlen und wird als Rückgabewert, den Preis des Films zurückgeben.
Verwende dabei try/catch, um ungültige Eingaben zu fangen.
Verwende deine Funktion nun, um auszudrucken: Welche der Zahlencodes sind ungültig?

 */

fun main() {
    try {
        println(getTitel(0x1A3F))
        println(getTitel(0x1A3FAA))
    } catch (e: Exception) {
        println(e)
    }
    println(filmPreisByCode(0x1A3F))
    println(filmPreisByCode(0x1A3FAA))
}

fun filmPreisByCode(artikelNr: Int): Double? {
    var preis: Double? = null
    try {
        var titel = getTitel(artikelNr)
        preis = preisListe[titel]
    } catch (e: Exception) {
        println("$artikelNr hat kein Eintrag")
    }
    return preis
}

val filmArtikelNr = listOf<Int>(
    0x1A3F,
    0xF,
    0xAF,
    0xC15,
    0xCCF,
    0x44FE,
    0x3EA,
    0x33444AAA,
    0xFAFC,
    0x1243,
    0xEEA,
    0xFFFFA,
    0xDE12,
    0xF67
)

val movieListe = listOf<String>(
    "The Dark Knight",
    "Indiana Jones",
    "Die Hard",
    "John Wick 4",
    "The Shawshank Redemption",
    "Schindler's List",
    "The Godfather",
    "John Wick 3",
    "Star Wars",
    "The Matrix",
    "Shrek",
    "The Lord of the Rings",
    "WHO KILLED CAPTAIN ALEX",
    "Spiderman",
)

fun getTitel(artikelNr: Int): String {
    var result = when (artikelNr) {
        0x1A3F -> "John Wick 4"
        0xF -> "Schindler's List"
        0xAF -> "The Godfather"
        0xC15 -> "WHO KILLED CAPTAIN ALEX"
        0xCCF -> "Spiderman"
        0x44FE -> "The Shawshank Redemption"
        0x3EA -> "The Dark Knight"
        0xFAFC -> "Die Hard"
        0x1243 -> "Indiana Jones"
        0xEEA -> "Star Wars"
        0xDE12 -> "The Matrix"
        0xF67 -> "The Lord of the Rings"
        else -> throw IllegalArgumentException("Ungültige Eingabe!!! ERROR!!!!")
    }
    return result
}

val preisListe: Map<String, Double> = mapOf(
    "The Dark Knight" to 1.99,
    "Indiana Jones" to 5.02,
    "Die Hard" to 59.89,
    "John Wick 4" to 128.99,
    "The Shawshank Redemption" to 60.61,
    "Schindler's List" to 199.00,
    "The Godfather" to 6.91,
    "John Wick 3" to 8.12,
    "Star Wars" to 8.59,
    "The Matrix" to 9.01,
    "Shrek" to 6.71,
    "The Lord of the Rings" to 9.87,
    "WHO KILLED CAPTAIN ALEX" to 0.02,
    "Spiderman" to 10.99,
)

/*
1. try = der code innerhalb des tryblocks wird ausgeführt, wenn eine Ausnahme auftritt. Danach wir die Kontrolle an catch übergeben.
2. catch = wird verwendet um auf eine bestimmte Ausnahme zu reagieren die im Try Block aufgetreten ist
3. throw = wird verwendet, um eine Ausnahme manuell auszulösen

- catch Parameter kann man wieder benennen wie man möchte
- die Typen des Catch parameter erben von der Throwble Klasse wie zum Beispiel:
    -> Exception: Die generische Ausnahme. Alle benutzerdefinierten Ausnahmen erben normalerweise von dieser Klasse.
    -> ArithmeticException: Tritt auf, wenn während einer arithmetischen Operation ein Fehler auftritt, z. B. Division durch Null.
    -> NullPointerException: Tritt auf, wenn auf eine Null-Referenz zugegriffen wird.
    -> ArrayIndexOutOfBoundsException: Tritt auf, wenn auf ein Array mit einem ungültigen Index zugegriffen wird.
    -> FileNotFoundException: Tritt auf, wenn versucht wird, auf eine Datei zuzugreifen, die nicht gefunden wurde.
    -> Custom Exception: Du kannst auch benutzerdefinierte Ausnahmen erstellen, die von Exception oder einer anderen Ausnahmeklasse erben.
    -> IOException: Tritt auf, wenn eine E/A-Operation fehlschlägt.
    -> IllegalArgumentException: Tritt auf, wenn eine ungültige Argumentübergabe an eine Methode erfolgt.
    -> IllegalStateException: Tritt auf, wenn der Zustand eines Objekts ungültig ist.
    -> NumberFormatException: Tritt auf, wenn eine Zeichenkette nicht in eine numerische Form umgewandelt werden kann.
    -> NoSuchElementException: Tritt auf, wenn versucht wird, auf ein Element zuzugreifen, das nicht vorhanden ist.


try {
    // Hier steht der Code, bei dem eine Ausnahme auftreten könnte
} catch (e: ExceptionType) {
    // Hier steht der Code, der ausgeführt wird, wenn eine Ausnahme vom Typ ExceptionType auftritt
    // Du kannst auf 'e' zugreifen, um Informationen über die Ausnahme zu erhalten
}
*/