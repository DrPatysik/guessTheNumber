import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    welcome()


    var counter:Int = 3
    var randomNumber = Random.nextInt(1, 11)
    println(randomNumber)
    var agree = true

    do {
        randomNumber
        var plNumb = countPlNumb(counter)


        when (plNumb) {
            randomNumber -> {println("Yes! Congratulation! You are winner!!!!")
                var agree = question()

                if (agree)
                {
                    randomNumber = Random.nextInt(1, 11)
                    println(randomNumber)
                    counter = 4
                }
                else {
                    println("Your answer is not yes!")
                    break
                }
            }
            in 1..randomNumber-> println("No! Your number is less ! ")
            in randomNumber..10-> println("No! Your number is greater! ")
            else -> println("Your range is wrong!!")
        }

        if(counter==1) {
           var agree = question()

                if (agree)
                {
                    randomNumber = Random.nextInt(1, 11)
                    println(randomNumber)
                     counter = 4
                }
                else {
                    println("Your answer is not yes!")
                    break
                }
            }


        counter--

    } while ( agree )

    println("Good bye!See you later! Come back again!!")
}


fun question():Boolean {
    println("Do you want to continue? yes/no")
    val answer = Scanner(System.`in`).next().toLowerCase() == "yes"
    return answer
}
fun countPlNumb(count:Int):Int {
    println("You have $count attempts! ")
    println(" Print any number from 1 until 10. ")
    val playerNumber = Scanner(System.`in`).nextInt()
    return playerNumber
}

fun welcome() {
    println("Enter your name")
    val userName = Scanner(System.`in`).next().toUpperCase()
    println("Hello,$userName!")

}
