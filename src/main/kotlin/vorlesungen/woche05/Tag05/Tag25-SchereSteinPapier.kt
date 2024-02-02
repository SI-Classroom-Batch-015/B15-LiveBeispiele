package vorlesungen.Woche05.Tag25

fun main() {

    val choices = listOf("schere", "papier", "stein")

    var gameOver = false

    var pcWins = 0
    var userWins = 0

    do {
        // Spiellogik: Spieler wählen
        println("Das Spiel beginnt! Schere, Stein oder Papier?")
        var pcChoice = choices.random()
        val userChoice = readln().lowercase()
        println("Der PC hat $pcChoice gewählt!")
        println("Du hast $userChoice gewählt!")

        // Auswählen, wer gewonnen hat
        // user Gewinnt
        if ((userChoice == "schere" && pcChoice == "papier") || (userChoice == "papier" && pcChoice == "stein") || (userChoice == "stein" && pcChoice =="schere")){
            userWins++
            println("Hurra, du hast gewonnen! $userChoice schlägt $pcChoice")
        // pc gewinnt
        } else if ((pcChoice == "schere" && userChoice == "papier") || (pcChoice == "papier" && userChoice == "stein") || (pcChoice == "stein" && userChoice =="schere")){
            pcWins+=1
            println("Der PC hat gewonnen. $pcChoice schlägt $userChoice \nVersuch's nochmal...")
        } else {
            print("Gleichstand! Ihr habt beide $userChoice/$pcChoice gespielt!")
        }

        println("Du hast bisher $userWins Siege!")
        println("Der PC hat bisher $pcWins Siege!")
        println("PUnktestand: $userWins : $pcWins")

        // Wann ist das spiel zuende?
        println("Nochmal spielen? (ja/nein)")
        var userInput = readln().lowercase()
        if (userInput == "nein"){
            gameOver = true
            println("Tschau. Spiel beendet...")
            // alternative: break
        }

    } while(!gameOver)



}