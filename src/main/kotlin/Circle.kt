class Circle (_name: String) : Shape (_name) {
    var radius:Double = 0.0

    fun setDimensions(_radius: Double) {
        radius = _radius
    }

    override fun printDimensions() {
        println("Radius is: ${radius}")
    }

    override fun getArea() : Double {
        return 3.14 * Math.pow(radius, 2.0)
    }
}