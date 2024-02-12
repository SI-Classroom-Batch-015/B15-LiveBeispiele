package vorlesungen.woche07

class Kleidung(name: String, price: Double, var size: Int = 0): Product(name,price){

    override fun toString(): String {
        return """
            ${super.toString()}
            Größe: $size
            """
    }
}