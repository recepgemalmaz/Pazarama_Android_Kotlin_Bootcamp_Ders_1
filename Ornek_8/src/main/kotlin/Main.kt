
fun String.Display(n:Int){
    for(i in 1..n){
        println(this)
    }
}

final class Deneme{
    fun Foo(){}
}

/*class Turemis:Deneme(){
    fun Bar(){}
}*/

fun Deneme.Bar(){}


fun main(args: Array<String>) {

    var str = "Hello World"
    str.Display(5)

    var obje = Deneme()

    obje.Bar()
    obje.Foo()

}