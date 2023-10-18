import java.util.Calendar

open class View{
    fun interface OnClickListener{
        fun onClick(v: View)
    }
}



class Button : View(){
    var clickListener: OnClickListener? = null
        get() = field
        set(ocl){
            field = ocl
        }

    fun setOnClickListener(listener: OnClickListener){
        this.clickListener = listener
    }
    fun PerformClick(){
        if (clickListener!= null)
        {
            clickListener!!.onClick(this)
        }
    }

}

/*
class Button_Click: View.OnClickListener{
    override fun onClick(v: View) {
        Thread.sleep(1000)
        var tz = Calendar.getInstance().time
        println("Button Clicked at $tz")
    }
}*/




fun main() {

    var btn = Button()

    //btn.clickListener = Button_Click()

    btn.setOnClickListener{
        Thread.sleep(1000)
        var tz = Calendar.getInstance().time
        println("Button Clicked at $tz")

    }

    btn.PerformClick()
    btn.PerformClick()
    btn.PerformClick()
    btn.PerformClick()


}