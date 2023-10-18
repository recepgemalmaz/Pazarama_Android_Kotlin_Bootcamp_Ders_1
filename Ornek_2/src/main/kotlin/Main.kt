open class CBase constructor(p: Int, q: Int) {
    open fun foo() {
        println("CBase foo")
    }

    //final yazildigi icin override edilemez
    final fun Bar(){
        println("CBase Bar")
    }

}



class CDerived constructor(x: Int, y: Int, z: Int) : CBase(p = x, q = x) {

    // override fun foo() = super.foo()
    override fun foo() {
        println("CDerived foo")
    }

    // override edilemez
    /*
    override fun Bar(){
        println("CDerived Bar")
    }*/


}


fun main() {

    var obj1 = CBase(3,4)
    var obj2 = CDerived(100,200,300)
    obj1.foo()
    obj2.foo()

}