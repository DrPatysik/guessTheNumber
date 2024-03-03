import java.util.*
import kotlin.random.Random

class CustomGame {
    companion object {
        private var playerNumber: Int = 0
        private var agree: Boolean = true
        private var counter = 0
        private var range = 0


        fun startGame() {
            range = createRange()
            counter = createAttempts()

            var randomNumber: Int = Random.nextInt(1, range + 1)
            println(randomNumber)

            do {
                playerNumber = attemptsNewNumber(counter, range)

                when (playerNumber) {
                    randomNumber -> {
                        println("Yes! Congratulation! You are winner!!!!")
                        agree = questionContinue()

                        if (agree) {
                            range = createRange()
                            counter = createAttempts() + 1
                            randomNumber = Random.nextInt(1, range + 1)
                            println(randomNumber)

                        } else {
                            println("Your answer is not yes!")
                            break
                        }
                    }

                    in 1..randomNumber -> println("No! Your number is less ! ")
                    in randomNumber..range -> println("No! Your number is greater! ")
                    else -> println("Your range is wrong!!")
                }

                if (counter == 1) {
                    agree = questionContinue()

                    if (agree) {
                        range = createRange()
                        counter = createAttempts() + 1
                        randomNumber = Random.nextInt(1, range + 1)
                        println(randomNumber)
                    } else {
                        println("Your answer is not yes!")
                        break
                    }
                }
                counter--
            } while (true)
            println("Good bye!See you later! Come back again!!")
        }

        private fun questionContinue(): Boolean {
            println("Do you want to continue? yes/no")
            return Scanner(System.`in`).next().toLowerCase() == "yes"
        }

        private fun attemptsNewNumber(counter:Int, range:Int): Int {
            println("You have $counter attempts! ")
            println(" Print any number from 1 until $range. ")
            return Scanner(System.`in`).nextInt()
        }

        private fun createAttempts(): Int {
            println("How much attempts do you want to create?")
            return Scanner(System.`in`).nextInt()
        }

        private fun createRange(): Int {
            println("What range do you want to create?From 1 until ..")
            return Scanner(System.`in`).nextInt()
        }
    }
}