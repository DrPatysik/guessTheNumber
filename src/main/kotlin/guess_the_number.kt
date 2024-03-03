import java.util.*
fun main(args: Array<String>) {
    welcome()

   //ClassicGame.startGame()
    CountAttempts.startGame()
}

fun welcome() {
    println("Enter your name:")
    val userName = Scanner(System.`in`).next().toUpperCase()
    println("Welcome,$userName, to the game Guess the NUMBER!")
}
