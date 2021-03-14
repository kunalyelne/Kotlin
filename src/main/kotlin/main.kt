import inheritance.Parent
import inheritance.Child

fun main(args: Array<String>) {
//    println("Hello Kotlin <3")
    var A = Parent(1, "hey")
    A.getValues()

    var B = Child(2, "Hello", true)
    B.getValues()
}
