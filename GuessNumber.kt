fun main() {
    val correctNumber = 7
    var guess: Int

    do {
        print("Guess a number between 1 and 10: ")
        guess = readLine()!!.toInt()
    } while (guess != correctNumber)

    println("Correct! You guessed the number.")
}