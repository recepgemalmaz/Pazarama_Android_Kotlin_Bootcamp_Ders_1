
abstract class Sekil {

    abstract fun Cizim()

}


open class Dikdortgen : Sekil() {

    override fun Cizim() {
        println("Dikdortgen cizildi")
    }

}

open class Daire : Sekil() {

    override fun Cizim() {
        println("Daire cizildi")
    }
    fun AlanHesapla() {
        println("Dairenin alani hesaplandi")
    }

}





fun main() {


    //Nesne yaratilamaz
    //var obj = Sekil()
    //var obj = Dikdortgen()
    var obj : Daire= Daire()
    var obj1 : Sekil= Dikdortgen()

    obj.Cizim()
    obj1.Cizim()

    //Ancak altakini yapamam
    //var obj2 : Daire = Sekil()

    var obj3 : Sekil = Daire()
    //obj3.AlanHesapla() //Hata verir
    //Sekil sinifinda AlanHesapla() fonksiyonu yoktur bunun icin hata verir

    var obj4 : Daire = Daire()
    obj4.AlanHesapla() //Hata vermez

}