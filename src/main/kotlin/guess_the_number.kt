import java.util.*
fun main(args: Array<String>) {
    welcome()

    when(chooseGame()){
        1 -> ClassicGame.startGame()
        2 -> CountAttempts.startGame()
        3 -> CustomGame.startGame()
        else -> println("You entered an incorrect number")
    }
}

fun welcome() {
    println("Enter your name:")
    val userName = Scanner(System.`in`).next().toUpperCase()
    println("Welcome,$userName, to the game Guess the NUMBER!")
}

fun chooseGame():Int {
    println("Please,choose the stage:" +
            "\n" + "1 - Classic game" +
            "\n" + "2 - Count attempts" +
            "\n" + "3 - Custom game")
    return Scanner(System.`in`).nextInt()

}
