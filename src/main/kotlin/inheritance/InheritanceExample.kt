package inheritance

open class Parent(private val a:Int, private val b: String) {
    open fun getValues() {
        println("$a and $b");
    }
}

class Child(private val a: Int, private val b: String, private val isChild: Boolean) : Parent(a, b){
    override fun getValues() {
        println("$a and $b and $isChild")
    }
}