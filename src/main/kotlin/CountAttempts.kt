import java.util.*
import kotlin.random.Random

class CountAttempts () {
    companion object {
        private var playerNumber:Int = 0
        private var agree:Boolean = true
        private var counter = 0


        fun startGame() {
            var randomNumber:Int = Random.nextInt(1, 101)
            println(randomNumber)

            do {
                counter++
                playerNumber = newNumber()


                when (playerNumber) {
                    randomNumber -> {
                        println("Yes! Congratulation! You are winner! You won in $counter attempt(s)!!!")

                        if (agree) {
                            randomNumber = Random.nextInt(1, 101)
                            println(randomNumber)
                            counter = 0
                        } else {
                            println("Your answer is not yes!")
                            break
                        }
                    }

                    in 1..randomNumber -> println("No! Your number is less ! ")
                    in randomNumber..100 -> println("No! Your number is greater! ")
                    else -> println("Your range is wrong!!")
                }

                if ((counter % 5 ) == 0 ) {

                    agree = questionContinue()

                    if (agree) {
                        continue
                    }
                    else {
                        println("Your answer is not yes!")
                        break
                    }
                }
            } while (true)
            println("Good bye!See you later! Come back again!!")
        }

        private fun questionContinue():Boolean {
            println("Do you want to continue? yes/no")
            return Scanner(System.`in`).next().toLowerCase() == "yes"
        }

        private fun newNumber():Int {
           // println("You have $counter attempts! ")
            println(" Print any number from 1 until 100. ")
            return Scanner(System.`in`).nextInt()
        }
    }
}