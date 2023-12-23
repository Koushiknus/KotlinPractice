class Person{

    var firstName : String? = null
    var lastName : String? = null

    constructor(){
        println("This is primary constructor")
    }

    constructor(firstName : String,lastName : String) : this(){
        println("This is secondary constructor")

    }

    init {
        println("This is first init block")
    }
    init {
        println("This is second init block")
    }
}

fun main(args: Array<String>){
    val person = Person("test","test")

}