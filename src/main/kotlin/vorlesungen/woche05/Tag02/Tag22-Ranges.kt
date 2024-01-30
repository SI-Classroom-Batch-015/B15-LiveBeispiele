package VORLESUNG.Woche05.Tag22
fun main(){
    // Ranges sind nicht das gleiche wie listen, ein paar Beispiele
    // Würfel
    val wuerfel: IntRange = 1..6
    // so wird eine Range ausgegeben
    println("Range: " + wuerfel)
    // im Gegensatz zu einer Liste:
    println("Liste: " + wuerfel.toList())
    // auf Ranges ist random aufrufbar:
    println("Würfel rollt.... " + wuerfel.random())



    // abc
    var abc: CharRange = 'a'..'z'
    println("ABC Range: $abc")
    println("ABC Liste: ${abc.toList()}")

    // Ranges mit step werden zu Progressions
    var numbers: IntProgression = 1..100 step 2
    println("Range mit Step: $numbers")
    println("Liste mit Step: ${numbers.toList()}")

    // DOWNTO: rückwärts
    var range: IntProgression = 10 downTo 1
    println(range)
    println(range.toList())
    for (i in range){
        println(i)
    }

}
