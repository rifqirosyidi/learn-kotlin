fun main(args: Array<String>){
    val anime = arrayOf("Naruto", "SAO", "SNK")
    val movies = arrayOf("The Hobbit", "The Maze Runner", "Turbo")
    val games = arrayOf("Age of Empires", "0 AD", "GTA")


    val name = "SAO"
    if (name in anime){
        println("$name is in Anime list")
    } else if (name in movies) {
        println("$name is in Movies list")
    } else if (name in games) {
        println("$name is in Games list")
    } else {
        println("$name isn't found in the list")
    }
}