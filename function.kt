/*fun hello() {
    return println("Hello, world!")
}

fun main() {
    hello()
} 

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(sum(1, 2))
}/

/fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun  main() {
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}/

/fun printMessageWithPrefix1(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    printMessageWithPrefix1("Hello", "Log")
    printMessageWithPrefix1("Hello")
    printMessageWithPrefix1(prefix = "Log", message = "Hello")
}/

/fun printMessage(message: String) {
    println(message)
}

fun main() {
    println("Hello")
}/

/fun sum(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    println(sum(1, 2))
}/

/fun sum(x: Int, y: Int) = x + y

fun main() {
    println(sum(1, 2))
}/

/fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(uppercaseString("hello"))
}/

/fun main() {
    println({ string: String -> string.uppercase() }("hello"))
}/

/*fun main() {
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)

    val numbers1 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers1.map { x -> x 2 }
    val tripled = numbers1.map { x -> x * 3 }
    println(doubled)
    println(tripled)
}*/
/*val upperCaseString: (String) -> String = { string -> string.uppercase() }

fun main() {
    println(upperCaseString("hello"))
}*/

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60}
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("total time is $totalTimeInSeconds secs")

    println({ string: String -> string.uppercase() }("hello"))

    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
}
//fim 