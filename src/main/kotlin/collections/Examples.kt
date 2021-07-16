package collections

fun main() {
    val a = mutableListOf(1,3,5,3,12,1,2,4,9,3,)
    a.sort()
    a.add(43)
    println(a)
    val set = mutableSetOf<Int>(1,2,1,4,5,8,3)
    println(set)
    var iterator = a.iterator()
    while(iterator.hasNext()) {
        print("${iterator.next()} ")
    }
    println()
    for (i in 0..10) print(i)
    println()
    val ar = Array(10) {"kyo"}
    for( i in ar) print(i)
    println()
    val arr = IntArray(10)
    for( i in arr) print(i)
}