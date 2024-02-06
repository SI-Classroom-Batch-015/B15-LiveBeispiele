fun main() {

    val firstBus: Bus = Bus(300, 30)
    val secondBus: Bus = Bus(250, 20)
    val thirdBus: Bus = Bus(350, 26)

    firstBus.honk()
    firstBus.durchsage()

    val seats = firstBus.seats
    println("Der Bus Nummer 1 hat $seats Sitze")

    println("Der erste Bus hat ${firstBus.horsePower} PS und ${firstBus.seats} Sitze")
    println("Der zweite Bus hat ${secondBus.horsePower} PS und ${secondBus.seats} Sitze")
    println("Der dritte Bus hat ${thirdBus.horsePower} PS und ${thirdBus.seats} Sitze")
}