
interface IBankAccount {
    fun Withdraw()
    fun Deposit()
}
interface IGetirliHesap{
    fun Profit()
}

class Vadesiz : IBankAccount {
    override fun Withdraw() {
        println("Vadesiz Hesaptan Para Çekildi")
    }

    override fun Deposit() {
        println("Vadesiz Hesaba Para Yatırıldı")
    }

}
class Vadeli : IBankAccount, IGetirliHesap {
    override fun Withdraw() {
        println("Vadeli Hesaptan Para Çekildi")
    }

    override fun Deposit() {
        println("Vadeli Hesaba Para Yatırıldı")
    }

    override fun Profit() {
        println("Vadeli Hesap Faiz Kazancı")
    }
}
class Katilim : IBankAccount, IGetirliHesap {
    override fun Withdraw() {
        println("Katılım Hesaptan Para Çekildi")
    }

    override fun Deposit() {
        println("Katılım Hesaba Para Yatırıldı")
    }

    override fun Profit() {
        println("Katılım Hesap Faiz Kazancı")
    }
}


fun main() {

}