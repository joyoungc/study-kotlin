fun main(args: Array<String>) {
    println("Hello World!")

    /* Block comment
        /* Block comments in Kotlin can be nested. */
     */

    printSum(1, 2)

    println(x)
    incrementX()
    println(x)

    val rectangle = Rectangle(5.0, 2.5)
    println("The perimeter is  ${rectangle.perimeter}")

    println("/* String templates */")
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)

    println(maxOf(2, 3))

    println("\n/* for loop */")
    val items = listOf("apple", "banana", "watermelon")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println("\n/* while loop */")

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println("\n/* when expression */")
    println(describe(1))
    println(describe("Hello"))
    println(describe(3.14))
    println(describe(2L))
    println(describe("Test"))
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

open class Shape

class Rectangle(var height: Double, var length: Double) : Shape() {
    var perimeter = (height + length) * 2
}

val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }