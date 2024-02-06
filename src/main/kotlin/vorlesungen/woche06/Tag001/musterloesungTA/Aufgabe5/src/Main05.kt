fun main() {

    // Mitarbeiter 1
    val mitarbeiter1 = Mitarbeiter(
        12,
        "Paul",
        2000,
        "System Administrator",
        false
    )

    mitarbeiter1.istVerfuegbar()
    mitarbeiter1.befoerdern()
    mitarbeiter1.gehaltAusgeben()

    // Mitarbeiter 2
    val mitarbeiter2 = Mitarbeiter(
        23,
        "Laura",
        2500,
        "Human Resources",
        true
    )

    mitarbeiter2.istVerfuegbar()
    mitarbeiter2.befoerdern()
    mitarbeiter2.gehaltAusgeben()

    // Mitarbeiter 3
    val mitarbeiter3 = Mitarbeiter(
        47,
        "Bernd",
        4000,
        "Abteilungsleiter",
        false
    )

    mitarbeiter3.istVerfuegbar()
    mitarbeiter3.befoerdern()
    mitarbeiter3.gehaltAusgeben()

}