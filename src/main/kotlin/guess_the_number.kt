import java.util.*
import kotlin.random.Random

fun main(args: Array<String>)
{
    val randomNumber = Random.nextInt(1,11)

    println("Select any number from 1 until 10")
    val playerNumber = Scanner(System.`in`).nextInt()

    when( randomNumber)
    {  playerNumber -> println("Yes! You are winner!")
       else -> println("No! You are loser!")
    }
    println()
    println("Good bye!See you later!")
}