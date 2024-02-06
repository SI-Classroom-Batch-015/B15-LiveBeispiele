fun main() {
    val perrson1 = Perrson("Max", alter = 25)
    val perrson2 = Perrson("Anna", alter = 17)
    val perrson3 = Perrson("Erik", alter = 30)

    val auto1 = Auto("grau", sitze = 2)
    val auto2 = Auto("silber", sitze = 4)

    auto1.passagiere.addAll(listOf(perrson1, perrson2, perrson3))
    auto2.fahrer = perrson1

    val personen = listOf(perrson1, perrson2, perrson3)

    if (personen.any { it.istErwachsen() } ){
        auto1.fahrer = (personen.filter { it.istErwachsen() }).random()
        auto1.passagiere.addAll(personen.filter { it != auto1.fahrer} )
    } else {
        println("Es gibt keinen gültigen Fahrer.")
    }

    var x = listOf(1,2,3,4)
    println(add(x))

}

fun add(x: List<Int>): Int{
    var gesamt = 0
    for (t in x){
        gesamt += t
        return gesamt
    }
    return gesamt
}