package vorlesungen.woche04.Tag05Wiederholung

fun main() {
    // ITERABLES
    // iterieren = über jedes einzelne Element rübergehen.

    // Strings sind iterabel: man kann über jeden einzelnen Buchstaben gehen
    var string = "Freitag"
    if ("r" in string) {
        println("Der Buchstabe r kommt vor.")
        println ("haha")
    }
    // wenn im Code Block nur 1 einziger Befehl kommt, brauchen wir keine { }
    else println("Der Buchstabe r kommt nicht vor.")


    // Listen, Maps, Sets sind iterabel
    var list = listOf("Montag","Dienstag","Mittwoch")
    if (list.contains("Mittwoch")) { // exakt das gleiche wie ("Mittwoch" in list)
        println("Mittwoch ist in der Liste")
    } else {
        println("Mittwoch ist nicht in der Liste.")
    }

    // Ranges sind iterabel
    var range: IntRange = 4..40
    if (1 in range){
        println("1 ist vorhanden")
    } else {
        println("1 ist nicht vorhanden")
    }

    // Try Catch Wiederholung
    println("Bitte Note eingeben...")
    var notenInput = 0
    var verbaleNote: String = "leerer String"
    try {
        notenInput = readln().toInt()
        verbaleNote = verbaleNotenWhen(notenInput)
    } catch (e: NumberFormatException){
        println("$e gefangen. Bitte gültige Zahl zum Konvertieren eingeben!")
    } catch (e: IllegalArgumentException){
        println("$e gefangen. Bitte gültige Note eingeben. Jetzt bekommst du eine Rüge")
        verbaleNote = "Was ist falsch mit dir??"
    }
    println("Die Note $notenInput ist verbal geprochen ein $verbaleNote")

    println("Weitere Note eingeben...")
    var bestandenOderNicht: Boolean = false
    try {
        var note: Int = readln().toInt()
        bestandenOderNicht = bestandenIfElse(note)
    } catch (e: Exception){
        println("Ungültige Zahl eingegeben. Per Default nicht bestanden.")
        // bestandenOderNicht = false // brauchen wir nicht, ist durch Z 49 eh schon false
    }

    // weitere Logik vom Ergebnis abhängig machen
    if (bestandenOderNicht){
        println("Wir sind zurueck in der main und du hast bestanden")
    } else {
        println("Wir sind zurueck in der main und du hast NICHT bestanden")
    }

}

fun bestandenIfElse(notenInput: Int): Boolean {
    if (notenInput in 5..6){ // ODER: (notenInput>4 && notenInput < 7)
        println("Du hast eine $notenInput und nicht bestanden :(")
        return false
    } else if (notenInput in 1..4) {
        println("Juhu, bestanden mit einer $notenInput")
        return true
    } else throw IllegalArgumentException("Du hast keine Note eingegeben.ERROR.")
}

// When Wiederholun
fun verbaleNotenWhen(notenInput: Int): String {
    // mit dem return vorne bräuchten wir nicht einzelne returns hinter den ->
    /* return */ when (notenInput) {
        1 -> return "sehr gut"
        2 -> return "gut"
        3 -> return "befriedigend"
        4 -> return "ausreichend"
        5 -> return "mangelhaft"
        6 -> return "ungenügend"
        else -> throw IllegalArgumentException("Bitte nur Zahlen von 1 bis 6 eingeben")
    }
}

fun verbaleNotenIfElse(notenInput: Int): String {
    // mit dem return vorne bräuchten wir nicht einzelne returns in den if blöcken
    /* return */ if (notenInput == 1){
        return "sehr gut"
    } else if (notenInput == 2){
        return "gut"
    } else if (notenInput == 3){
        return "befriedigend"
    } else if (notenInput == 4){
        return "ausreichend"
    } else if (notenInput == 5){
        return "mangelhaft"
    } else if (notenInput == 6){
        return "ungenügend"
    }
    else throw Exception("Ungültige Eingabe")
}

