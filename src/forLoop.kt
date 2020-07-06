fun main(args: Array<String>) {

    for (i in 1..5){
        println("Line $i")
    }

    var my_box = arrayOf("Gold", "TRASH", "Ruby", "Diamond", "TRASH", "Metal", "Silver", "TRASH", "Sapphire")
    for (box in my_box){
        println("Scanning...")
        //  if (box != "TRASH"){
        //      println("Item has been Found: $box")
        //  }

        if (box == "TRASH") { continue }
        println("Item has been Found: $box")
    }

}