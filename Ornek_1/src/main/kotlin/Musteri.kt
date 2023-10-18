class Musteri constructor(id : Int, ad: String, soyad: String) {

    //property : özellik
    //Stored Property
    public var nm : String = ad.uppercase()
    private var snm : String = soyad.uppercase()
    private var id : Int = id

    init { // constructor bloğu ezilebilir
        println("Müşteri Oluşturuldu")
        nm = ad
        snm = soyad
        this.id = id

    }

    fun Goster(){
        println("Müşteri ID: $id")
        println("Müşteri Adı: $nm")
        println("Müşteri Soyadı: $snm")
    }



}


class Dikdortgon constructor(val width : Int, val height : Int){
    init {
        println("Dikdörtgen Oluşturuldu")
    }
    //computed property: hesaplanan özellik
    val alan : Int
        get() = width * height

    private var renkValue = ""

    var renk : String
        get() {
            return this.renkValue
        }
        set(value) {
            this.renkValue = value
        }
}

fun main() {
    var m1 = Musteri(1, "ali", "veli")

    m1.nm = "ahmet"
    m1.Goster()

    var d1 = Dikdortgon(10, 20)
    println("Dikdörtgenin Alanı: ${d1.alan}")
    d1.renk = "kırmızı"
    println("Dikdörtgenin Rengi: ${d1.renk}")

}