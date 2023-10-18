class Sample private constructor(state: Int) {

    private var m_state: Int = 0

    public var State: Int
        get() = m_state
        set(value) {
            if (value > 0) {
                m_state = value
            }

        }

    init {
        m_state = state
    }

    companion object Singleton {
        private var m_instance: Sample? = null

        public fun CreateInstance(data: Int): Sample {
            if (m_instance == null) {
                m_instance = Sample(data)
            }
            return m_instance as Sample
        }
    }

    fun Display() {
        println("State: $m_state")
    }
}


fun main(args: Array<String>) {

    var smp1 = Sample.Singleton.CreateInstance(1)
    var smp2 = Sample.Singleton.CreateInstance(2)
    var smp3 = Sample.Singleton.CreateInstance(3)
    var smp4 = Sample.Singleton.CreateInstance(4)

    smp1.Display()
    smp2.Display()
    smp3.Display()
    smp4.Display()

    smp1.State = 10
    smp1.Display()
    smp2.Display()
    smp3.Display()
    smp4.Display()


}