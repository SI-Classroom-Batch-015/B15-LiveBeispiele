package vorlesungen.woche06.Tag02

// Katze mit Default-Attributen
class Cat(
    var name: String,
    var alter: Int,
    var rasse: String,
    var favoriteToy: Toy,
    var sterilized: Boolean = false
) {


    fun sterilize(){
        sterilized = true
    }


}
