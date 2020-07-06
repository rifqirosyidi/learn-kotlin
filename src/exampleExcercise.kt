fun main(args: Array<String>) {

    // Find silver and gold in given var and count

    var my_box = arrayOf("Gold", "Ruby", "Silver", "Gold", "Diamond", "Silver", "Gold", "Gold", "Sapphire", "Ruby")

    var total_silver = 0
    var total_gold = 0

    for (item in my_box){
        when(item){
            "Silver" -> ++total_silver
            "Gold" -> ++total_gold
        }
    }

    println("You have $total_silver Silver")
    println("You have $total_gold Gold")

}