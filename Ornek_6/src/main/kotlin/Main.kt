

class Sample private constructor()
{
    companion object Factory
    {
        fun createSample() : Sample
        {
            //...
            return Sample()
        }
    }

    fun Foo()
    {
        println("Sample: Foo")
    }
}



fun main() {

    //Obje olustururken private bir classi boyle yapabilirsin.
    var smp = Sample.Factory.createSample()
    smp.Foo()

}