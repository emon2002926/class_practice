import kotlin.random.Random

val finalRewardList: MutableList<String> = mutableListOf()
var gamesPlayed = 0
fun main() {
    println("Welcome to the Guess the Number game ")
    println("if you can guess the number with 8 step you will get reward ! " +
            "Press Enter to contunue  ")
    readLine()

    game()

}

fun  game (){
    // Generate a random number between 1 and 100
    val secretNumber = Random.nextInt(1, 100)
    var attempts = 0
    var guess: Int
    val maxAttempts = 8

    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull() ?: 0

        if (guess in 1..100) {
            attempts++

            when {
                guess < secretNumber -> println("Too low! Try again.")
                guess > secretNumber -> println("Too high! Try again.")
                else ->{
                    showRwards(attempts)
                    attempts = 0
                    break
                }
            }
        } else {
            println("Please enter a number between 1 and 100.")
        }
    } while (attempts <maxAttempts)
    gamesPlayed++

    if (gamesPlayed <= 1){
        println("you have tried maximum number of attemps")
        println("You lose all of your rewards.")
        finalRewardList.clear()    }

}

fun showRwards(attempts: Int){
    println("Congratulations! You guessed the correct number in $attempts attempts.")

    val rewardList= arrayOf("Cadbury Dairy Milk","KitKat","Box of Center Fruit","Cadbury")
    rewardList.forEachIndexed { index, s ->
        println("${index+1} $s ")
    }
    println("That's your  reawrds pick one")

    val chockletIndex = readlnOrNull()?.toIntOrNull()?.minus(1)

    finalRewardList.addLast(rewardList[chockletIndex!!])

    println("Would you like more rewards? Type 'yes' to play again.\n" +
            "If you play a second time and lose, all of your rewards will be gone. \n" +
            "Type 'no' to keep your current reward.")

    val userDecision = readLine()?.trim()?.toLowerCase()

    when (userDecision) {
        "yes" -> {
            println("Starting the game again ...")

            game()
        }
        "no" -> {println("Exiting the program.")
            finalRewardList.forEachIndexed{ index, s ->
                println("${index+1} $s ")
            }

        }
        else -> println("Invalid input. Please enter 'Yes' or 'No'.")
    }
}
