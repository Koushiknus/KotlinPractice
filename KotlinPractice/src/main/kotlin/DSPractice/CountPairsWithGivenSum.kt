package DSPractice

fun main(args: Array<String>) {
    //https://www.geeksforgeeks.org/count-pairs-with-given-sum/
    //Count pairs with given sum
    val arr = intArrayOf(1, 5, 7, -1, 5)
    val K = 6
    // Function Call
    // Function Call
    getPairsCount(arr, K)

}

fun getPairsCount(arr: IntArray, k: Int) {
    var count = 0
    for(i in 0..arr.size-1){
        for(j in i+1..arr.size-1){
            if(arr[i]+arr[j] == k){
                count++
            }
        }
    }
    println("Count Is $count")
}
