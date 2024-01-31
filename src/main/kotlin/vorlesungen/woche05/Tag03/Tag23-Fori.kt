package vorlesungen.woche05.Tag03

fun main() {
    // 1. simple for schleife mit absteigender range an chars
    for (buchstabe in 'z' downTo 'a'){
        print("$buchstabe, ")
    }


    println()

    println("-----")

    // 2. simple for i schleife bei der wir über indices gehen und drucken
    var eisSorten = listOf("Schokolade","Vanille","Erdbeere")
    for (i in eisSorten.indices){
        print("$i ")
        print(eisSorten[i])
        println("")
    }


    println("----")
    // 3. gleiche funktion mit for in schleife von gestern
    for (eis in eisSorten) println(eis)

    println("-----")
    val movies = mutableListOf("Harry Potter", "Der Herr der Ringe", "The Hunger Games")

    // 3. strings modifizieren: an jeden Film eine 2 hängen
    for (i in movies.indices){
        movies[i] = movies[i] + " 2"
    }
    println(movies)



    println("-----")

    val nrList = mutableListOf(22,34,808,99,6,4,7)

    println(nrList)
    // 4. jede 2. Zahl in Liste verdoppeln
    for (i in nrList.indices step 2){
        nrList[i] = nrList[i]*2
    }
    println(nrList)
    println("----")

    nrList.clear()
    nrList.addAll(mutableListOf(99,56,44,33,22,11,77))
    println(nrList)

    // 5. jede Zahl, die UNgerade ist, verdoppeln
    for (i in nrList.indices){
        if (nrList[i] % 2 != 0){
            println("Ungerade Zahl identifiziert! ${nrList[i]} \nWird verdoppelt...")
            nrList[i] = nrList[i]*2
        }
    }
    println(nrList)

    println(nrList)

    // 6. jede 2. Zahl in Liste verdoppeln, aber nicht index 0,2,4 sondern index 1,3,5
    for (i in nrList.indices){
        if (i % 2 != 0){
            nrList[i] *= nrList[i]*2
        }
    }
    println(nrList)
    println("----")



}