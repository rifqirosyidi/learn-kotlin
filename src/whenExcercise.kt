fun main(args: Array<String>) {

    val num1 = 40
    val num2 = 15

    println("Enter an operand! (+, -, * or /)")
    val operand = readLine()

//    val hasil = if (operand == "+") num1 + num2
//                else if (operand == "-") num1 - num2
//                else if (operand == "*") num1 * num2
//                else if (operand == "/") num1 / num2
//                else "Operand is not valid"

    // using when condition
    val hasil = when(operand) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Operand Not Valid"
    }

    print(hasil)
}