package vorlesungen.woche06.Tag03Vererbung.WiederholungBibliothek


class Autor(val name: String, val geburtsjahr: Int) {
    val bücher = mutableListOf<Buch>()

    fun buchSchreiben(titel: String, genre: Genre, bibliothek: Bibliothek) {
        val buch = Buch(titel, this, genre)
        bücher.add(buch)
        genre.bücher.add(buch)
        bibliothek.buchHinzufügen(buch)
    }


}