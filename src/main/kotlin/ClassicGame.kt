import java.util.*
import kotlin.random.Random

class ClassicGame () {
    companion object {
        private var playerNumber:Int = 0
        private var agree:Boolean = true
        private var counter = 3


        fun startGame() {
            var randomNumber:Int = Random.nextInt(1, 11)
            println(randomNumber)

            do {
                playerNumber = attemptsNewNumber(counter)

                when (playerNumber) {
                    randomNumber -> {
                        println("Yes! Congratulation! You are winner!!!!")
                        agree = questionContinue()

                        if (agree) {
                            randomNumber = Random.nextInt(1, 11)
                            println(randomNumber)
                            counter = 4
                        } else {
                            println("Your answer is not yes!")
                            break
                        }
                    }

                    in 1..randomNumber -> println("No! Your number is less ! ")
                    in randomNumber..10 -> println("No! Your number is greater! ")
                    else -> println("Your range is wrong!!")
                }

                if (counter == 1) {
                    agree = questionContinue()

                    if (agree) {
                        randomNumber = Random.nextInt(1, 11)
                        println(randomNumber)
                        counter = 4
                    } else {
                        println("Your answer is not yes!")
                        break
                    }
                }
                counter--
            } while (true)
            println("Good bye!See you later! Come back again!!")
        }

        private fun questionContinue():Boolean {
            println("Do you want to continue? yes/no")
            return Scanner(System.`in`).next().toLowerCase() == "yes"
        }

        private fun attemptsNewNumber(counter:Int):Int {
            println("You have $counter attempts! ")
            println(" Print any number from 1 until 10. ")
            return Scanner(System.`in`).nextInt()
        }
    }
}