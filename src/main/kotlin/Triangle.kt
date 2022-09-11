open class Triangle (_name: String) : Shape (_name) {
    var a:Double = 0.0
    var b:Double = 0.0
    var c:Double = 0.0

    fun setDimensions(_a:Double, _b:Double, _c:Double) {
        a = _a
        b = _b
        c = _c
    }

    override fun printDimensions() {
        println("Three sides of triangle are: a = ${a}, b = ${b}, c = ${c}")
    }

    override fun getArea() : Double {
        // s = 1/2 perimeter
        var s = 0.5 * (a + b + c)

        return Math.sqrt( s * (s - a) * (s - b) * (s - c) )
    }
}