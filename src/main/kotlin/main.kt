import ConstructorTypes.Example
import ConstructorTypes.Example2
import ConstructorTypes.Example3
import ConstructorTypes.Example4
import inheritance.Child
import inheritance.Parent


fun main(args: Array<String>) {
//    println("Hello Kotlin <3")

    //Inheritance
    val A = Parent(1, "hey")
    A.getValues()

    val B = Child(2, "Hello", true)
    B.getValues()

    //Constructor and Types
    val C = Example(1,1)
    C.printValues()

    val D = Example2(2,2)
    D.printValues()

    val E = Example3(3,3)
    E.printValues()

    val F = Example4(1,2)
    F.printValues()

    val G = Example4(1,2,"Hey!")
    G.printValues()
}

fun multiply(x: Int, y: Int) = x*y
