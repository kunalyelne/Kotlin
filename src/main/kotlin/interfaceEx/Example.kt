package interfaceEx

interface Example {
    fun printHell()
}

class Example_interface: Example {
    override fun printHell() {
       println("Hell")
    }
}
