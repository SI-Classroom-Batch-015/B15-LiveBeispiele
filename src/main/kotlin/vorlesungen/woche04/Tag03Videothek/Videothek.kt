// Die FilmListe hat alle unsere Filme
val filmListe = mutableListOf<String>(
    "The Dark Knight",  
    "Indiana Jones",  
    "Die Hard",  
    "The Shawshank Redemption",  
    "Schindler's List",  
    "The Godfather",  
    "Star Wars",  
    "The Matrix",
    "The Lord of the Rings",
    "Barbie"
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to 1.0,
    "Indiana Jones" to 1.0,
    "Die Hard" to 1.0,
    "The Shawshank Redemption" to 1.0,
    "Schindler's List" to 1.0,
    "The Godfather" to 1.0,
    "Star Wars" to 1.0,
    "The Matrix" to 1.0,
    "The Lord of the Rings" to 1.0,
    "Barbie" to 1.0
)

// Diese Map speichert das Genre zu jedem Filmtitel
val filmToGenre = mutableMapOf(
    "The Dark Knight" to "Action/Adventure",
    "Indiana Jones" to "Action/Adventure",
    "Die Hard" to "Action/Adventure",
    "The Shawshank Redemption" to "Drama",
    "Schindler's List" to "Drama",
    "The Godfather" to "Drama",
    "Star Wars" to "Science Fiction/Fantasy",
    "The Matrix" to "Science Fiction/Fantasy",
    "The Lord of the Rings" to "Science Fiction/Fantasy",
    "Barbie" to "Comedy"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(),
    "Indiana Jones" to generateRatings(),
    "Die Hard" to generateRatings(),
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Matrix" to generateRatings(),
    "The Lord of the Rings" to generateRatings(),
    "Barbie" to generateRatings()
)