fun Test(i: Int, s: String, f: (prm: String) -> Unit)
{
    if(i>0)
    f.invoke("pozitif ${i} , ${s}")
    else
    f.invoke("negatif ${i}, ${s}")


}


fun main() {
    Test(i =5 , s = "test1", f = {
        println(it)
    })

    Test(i =-5 , s = "test2", f = {
        println(it)
    })

}