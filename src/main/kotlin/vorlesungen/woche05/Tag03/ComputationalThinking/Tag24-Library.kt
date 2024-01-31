package vorlesungen.Woche05.ComputationalThinking


fun borrowBook(title: String, library: MutableList<Pair<String,Boolean>>): Boolean {
    for (book in library) {
        if (book.first == title && book.second) {
            library.remove(book) // Das Buch aus der Liste entfernen
            return true
        }
    }
    return false
}

fun main() {
    val library = mutableListOf(
            Pair("Harry Potter", true),
            Pair("Lord of the Rings", true),
            Pair("The Hobbit", true)
        )

    // Buch ausleihen: wie kann das funktionieren?
}
