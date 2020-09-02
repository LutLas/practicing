fun main() {
    val choices = arrayOf("Rock","Paper","Scissor")
    print(getGameChoice(choices))
}

fun getGameChoice(choicesChosen:Array<String>)=choicesChosen[(choicesChosen.size*Math.random()).toInt()]

/*
fun getUserChoice(choices:Array<String>):String {
    return ""
}

fun max(a:Int,b:Int)=if(a>b) a else b*/
