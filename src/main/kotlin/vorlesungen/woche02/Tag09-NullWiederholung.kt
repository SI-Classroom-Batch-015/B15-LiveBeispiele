package vorlesungen.Woche02

fun main() {
    // WIEDERHOLUNG: NULL

    // nullable Variable (nullable bedeutet: kann null enthalten. Das ? macht's hinterm Datentyp möglich)
    var nr: Int? = null
    nr = 12
    nr = null


    // mit einer nullable Variable weiterarbeiten: wir brauchen einen SAFE CALL (?) oder einen NON NULL ASSERTED CALL (!!)

        // Non Null Asserted Call: wir garantierem dem Compiler, dass hier nicht null drin steht. Ist die Variable dann doch null, stürzt das Programm ab.
        var intToDouble: Double = nr!!.toDouble() // Code stürzt hier ab, wenn in nr null drin steht
        println(intToDouble)


    // Safe Call: falls in nullableNumber null steht, wird einfach null statt dem gewollten Double zurück gegeben und das Programm läuft weiter
        // nr ist jetzt null, Programm wird auf jeden Fall abstuerzen wegen dem !!
        var intToString: String? = nr?.toString()
        println(intToString)










}