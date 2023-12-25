fun rollDice(numberOfTimes : Int , calculate : (result : Int) -> Unit ){

    calculate(numberOfTimes*numberOfTimes)
}
fun main() {
    rollDice(4,{result->
        println(result)
    })
}