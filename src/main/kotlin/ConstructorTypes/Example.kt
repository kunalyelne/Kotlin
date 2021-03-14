package ConstructorTypes

class Example(a:Int, b:Int) {

    private var Ex_a: Int
    private var Ex_b: Int

    init {
        Ex_a = a
        Ex_b = b
    }

    fun printValues() {
        println("$Ex_a and $Ex_b")
    }
}

class Example2(private var a: Int, private var b: Int) {
    fun printValues() {
        println("$a and $b")
    }
}

class Example3 constructor(@Volatile private var a: Int, private var b: Int) {
    fun printValues() {
        println("$a and $b")
    }
}

class Example4(private var a: Int, private var b:Int) {
    private var Ex_t: String? = null;
    //secondary constructor
    constructor(a:Int, b:Int, t: String) : this(a,b) {
        Ex_t = t
    }

    fun printValues() {
        println("$a and $b and $Ex_t")
    }
}