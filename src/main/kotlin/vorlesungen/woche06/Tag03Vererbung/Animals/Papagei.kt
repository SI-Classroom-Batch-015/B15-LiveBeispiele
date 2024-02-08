package vorlesungen.woche06.Tag03Vererbung.Animals

class Papagei(name: String, var kannSprechen: Boolean): Vogel(name) {

    init {
        println("PAPAGEI $name initialisiert!")
    }

    // override funs sind automatisch überschreibbar
    override fun fortBewegung() {
        super.fortBewegung()
        println("Der Papageie namens ${this.name} ist so schön, wenn er fliegt...")

    }

    /*
    NICHT moglich: essen in der Mutter Vogel ist final
    override fun essen(){ }
    */

    fun talk(){
        if (kannSprechen){
            println("Der Papagei $name erzählt uns was...")
        } else println("$name bleibt stumm.")
    }

    override fun toString(): String {
        return "Papagei: $name"
    }


}