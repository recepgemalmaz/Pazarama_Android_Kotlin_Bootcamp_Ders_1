
interface ISample {
    val prop: Int
    fun Foo (){
        println("Foo")
    }
    fun Bar()
    fun Bar2()
}

class CSample : ISample {
    override val prop: Int = 29

    override fun Bar() {
        println("CSample Bar")
    }

    override fun Bar2() {
        println("CSample Bar2")
    }

    override fun Foo() {
        println("CSample Foo")
    }
}




fun main() {

    var smp: ISample = CSample()
    smp.Foo()



}