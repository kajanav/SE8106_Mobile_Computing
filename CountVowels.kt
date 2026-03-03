fun main() {
    val text = "Hello Kotlin"
    var count = 0

    for (ch in text.lowercase()) {
        if (ch in "aeiou") {
            count++
        }
    }

    println("Number of vowels: $count")
}