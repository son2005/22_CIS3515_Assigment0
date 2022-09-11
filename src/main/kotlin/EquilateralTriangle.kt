class EquilateralTriangle (_name: String) : Triangle (_name) {

    fun setDimensions(side:Double) {
        a = side
        b = side
        c = side
    }

    override fun printDimensions() {
        println("The side of equilateral triangle is: side = ${a}")
    }

}