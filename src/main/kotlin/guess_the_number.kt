import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {

    var counter:Int = 3
    do {
        println("You have $counter attempts! ")
        val randomNumber = Random.nextInt(1, 11)

        println(" Print any number from 1 until 10. ")
        val playerNumber = Scanner(System.`in`).nextInt()

        when (playerNumber) {
            randomNumber -> {println("\n Yes! Congratulation! You are winner!!!!")
            break }
            in 1..randomNumber-> println("\n No! Your number is less ! ")
            in randomNumber..10-> println("\n No! Your number is greater! ")
            else -> println("\n Your range is wrong!!")
        }
        when(counter){
            in 2..3 -> println("Do you want to continue? yes/no")
             1 -> break
        }
        val agree = Scanner(System.`in`).next().toLowerCase()
        counter--
        if(agree != "no" && agree !="yes")
        { println("Your answer is wrong!")}

    } while (agree == "yes" && counter !=0 )

    println("Good bye!See you later! Come back again!!")
}
