fun main() {
    val choices = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(choices)
    val userChoice = getUserChoice(choices)
    /*println(getGameChoice(choices))*/
    /*for ((index,x) in choices.withIndex()) {
        val indexed = index+1
        //Your code goes here
        println("$x is Option $indexed")

    }*/
    println(printResult(userChoice,gameChoice))
}

fun getGameChoice(choicesChosen:Array<String>)=choicesChosen[(choicesChosen.size*Math.random()).toInt()]


fun getUserChoice(choices:Array<String>):String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice){
        //user prompt
    println("Please enter one of the following:")
    for (choice in choices)print(" $choice")
    println(".")
        //user input
    val userInput = readLine()
        //user input validation
        if(userInput != null && userInput in choices){
            isValidChoice = true
            userChoice = userInput
        }else{
            println("You must enter a valid choice")
        }
    }
    return userChoice
}

fun printResult(userChoice:String,gameChoice:String):String{

    return if(userChoice == gameChoice) "$gameChoice is same with $userChoice.tie"
    else if ((userChoice == "Rock" && gameChoice == "Scissors")||
            (userChoice == "Paper" && gameChoice == "Rock")||
            (userChoice == "Scissors" && gameChoice == "Paper")) "$userChoice beats $gameChoice. You Win"
    else "$gameChoice beats $userChoice. You Lose"
}
/*
fun max(a:Int,b:Int)=if(a>b) a else b*/


