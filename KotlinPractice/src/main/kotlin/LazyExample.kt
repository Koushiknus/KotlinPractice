

fun main() {
   val pi by lazy {
       println("Lazy Init")
       3.14
   }

   println(pi*pi)
   println(pi*pi)
}