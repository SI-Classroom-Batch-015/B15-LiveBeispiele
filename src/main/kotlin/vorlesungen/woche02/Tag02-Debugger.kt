package vorlesungen.Woche02

fun main() {

    // values/Konstanten: können nicht bearbeitet werden
    val mutable: MutableList<String> = mutableListOf("Apfel","Banane","Brokkoli")

    val immutable: List<String> = listOf("Apfel","Banane","Brokkoli")
    println(mutable)

    // VALUE TYPE VS REFERENCE TYPE
    val string: String = "Brot"
    //string = "Kuchen" // <-- value type nicht veränderbar.


    // val: mutable operationen overriden val, allerdings kann nicht eine brand neue referenz reingeschrieben werden:
    mutable.add("Birne")
    mutable.add("Kirsche")
    mutable.sort()
    println(mutable)
    mutable.remove("Apfel")
    //mutable = mutableListOf("Kakao") // <-- geht nicht

    // IndexOutOfBoundsException
    println(mutable[mutable.size-1]) // in size steht 5, Index geht aber nur bis 4




}