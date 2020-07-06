fun main(args: Array<String>){
    val names = arrayOf("Rif", "Qi")
    println(names.toList())

    // condition
    val money = 100
    println("money: $money")
    if (money > 20){
        println("your money is above 20")
    } else {
        println("your money is below 20")
    }

    // condition within variables
    val age = 25
    val my_age = if (age > 20){
                    "your age is above 20"
                } else {
                    "your age is below 20"
                }
    println(my_age)

    // simplify if only one row below if statement dont use { } or keep in oneline

    val myObject = "moon"
    if (myObject == "sun")
        println("your object is sun")
    else
        println("your object is moon")

    val color = "red"
    if (color == "red") println("your color is red")
    else println("your color is not red")

}