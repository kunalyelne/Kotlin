package collections

fun main() {
    val a = mutableListOf(1,3,5,3,12,1,2,4,9,3,)
    a.sort()
    a.add(43)
    println(a)
}