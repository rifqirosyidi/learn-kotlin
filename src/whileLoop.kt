fun main(args: Array<String>) {

    var i = 1
    while (i <= 10) {
        println("This is Line $i")
        ++i
    }

    println("==============")


    // print even num up to 20 using while
    var e = 1
    while (e*2 <= 20) {
        var even = e*2
        println("Even: $even")
        ++e
    }
}