import java.util.*
//import kotlin.random.Random

fun main(args: Array<String>) {
    welcome()

   println( ClassicGame.startGame() )

}

fun welcome() {
    println("Enter your name:")
    val userName = Scanner(System.`in`).next().toUpperCase()
    println("Welcome,$userName, to the game Guess the NUMBER!")
}
