package abstractEx

abstract class Example {

    abstract fun printHello()
}

abstract class Example2(val b: Int) {
    abstract fun printHey()
    fun printHello() {
        println("Hello and $b")
    }
}

class abstract_Ex : Example() {
    override fun printHello() {
        println("Hello")
    }
}

class abstract_Ex2(b:Int) : Example2(2) {
    override fun printHey() {
        println("Hey and $b")
    }
}