fun main(args: Array<String>) {

    // keep adding the number if the user input is not zero

    var input = ""
    var total = 0

    do {
        print("Enter number: ")
        input = readLine()!!
        total += input.toInt()
    } while (input != "0")

    print("Total number: $total")

}