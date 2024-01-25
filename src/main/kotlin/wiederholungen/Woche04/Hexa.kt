fun main() {
    val hexString = "CCF"

    // Hexadezimalzahl in einen Integer-Wert umwandeln
    val intValue = hexString.toIntOrNull(radix = 16)

    if (intValue != null) {
        println("Die Hexadezimalzahl $hexString entspricht dem Integer-Wert $intValue.")
    } else {
        println("Ungültige Hexadezimalzahl: $hexString")
    }
}

