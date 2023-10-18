
fun interface IFuseActiom{
    fun Broke(s:Sigorta)
}


class Sigorta public constructor(marka: String, anma_akimi: Int) {

    var Marka = ""
        get() = field
        private set(v) {
            field = v
        }

    var Anma_Akimi = 0
        get() = field
        private set(v) {
            field = v
        }

    var Fiyat = 0

    var onAction: IFuseActiom? = null

    fun setAction(action: IFuseActiom) {
        onAction = action
    }

    init {
        Marka = marka
        Anma_Akimi = anma_akimi
    }

    fun AkimKontrolu(gecenAkim: Int) {
        if (gecenAkim >= Anma_Akimi) {
            //evet raise exception
            if (onAction != null){
                onAction!!.Broke(this)
            }
        } else {
            println("Gecen Akim: $gecenAkim")
        }
    }
}

class SigortaAtmaK:IFuseActiom{
    override fun Broke(s: Sigorta) {
        println("${s.Marka} Sigorta Attı")
    }
}

fun main() {

    var fuse1 = Sigorta(marka = "Siemens", anma_akimi = 10)
    var fuse2 = Sigorta(marka = "Schneider", anma_akimi = 5)

    fuse1.setAction(SigortaAtmaK())
    //fuse2.setAction(SigortaAtmaK())
    //alltaki gosterim ile sigorta atmak sinifina gerek kalmaz
    fuse2.setAction{
        println("${it.Marka} Sigorta Attı")
    }


    for (i in 1..15) {
        fuse1.AkimKontrolu(i)
        fuse2.AkimKontrolu(i)
    }

}