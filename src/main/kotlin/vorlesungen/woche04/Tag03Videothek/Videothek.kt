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
    "The Dark Knight" to generateRandomPrice(),
    "Indiana Jones" to generateRandomPrice(),
    "Die Hard" to generateRandomPrice(),
    "The Shawshank Redemption" to generateRandomPrice(),
    "Schindler's List" to generateRandomPrice(),
    "The Godfather" to generateRandomPrice(),
    "Star Wars" to generateRandomPrice(),
    "The Matrix" to generateRandomPrice(),
    "The Lord of the Rings" to generateRandomPrice(),
    "Barbie" to generateRandomPrice()
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