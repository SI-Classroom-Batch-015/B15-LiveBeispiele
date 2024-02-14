package vorlesungen.woche08.VerschiedeneKlassen


    // Abstrakte Klasse Character
    abstract class Character(val name: String, var hp: Double, var level: Int) {
        abstract fun attack(character: Character)

    }

    // Hero Klasse erbt von Character
    class Hero(name: String, hp: Double, level: Int) : Character(name, hp, level) {
        override fun attack(character: Character) {
            // Angriffslogik
        }

    }

    // Enemy Klasse erbt von Character
    class Enemy(name: String, hp: Double, level: Int) : Character(name, hp, level) {
        override fun attack(character: Character) {
            // Angriffslogik
        }

    }

