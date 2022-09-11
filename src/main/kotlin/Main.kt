import java.util.Scanner

fun main(args: Array<String>) {

    // create reader object for taking input from user
    val reader = Scanner(System.`in`)

    // Create one instance of each class and store each in a variable of type Shape
    val mySquare:Shape = Square("MySquare")
    val myCircle:Shape = Circle("MyCircle")
    val myTriangle:Shape = Triangle("MyTriangle")
    val myEquilateralTriangle:Shape = EquilateralTriangle("MyEquilateralTriangle")

    // Prompt the user to enter the dimensions for each object
    // Square
    println("Enter length and height of the square")
    print("\tLength: ")
    val length:Double = reader.nextDouble()
    print("\tHeight: ")
    val height:Double = reader.nextDouble()

    // Circle
    println("Enter the radius of the circle:")
    val radius:Double = reader.nextDouble()

    // Triangle
    println("Enter 3 sides of the triangle")
    print("\ta: ")
    val a:Double = reader.nextDouble()
    print("\tb: ")
    val b:Double = reader.nextDouble()
    print("\tc: ")
    val c:Double = reader.nextDouble()

    // Equilateral Triangle
    println("Enter the side of the triangle:")
    print("\tSide: ")
    val side:Double = reader.nextDouble()

    // Set dimensions for all objects
    (mySquare as Square).setDimensions(length, height)
    (myCircle as Circle).setDimensions(radius)
    (myTriangle as Triangle).setDimensions(a, b, c)
    (myEquilateralTriangle as EquilateralTriangle).setDimensions(side)

    // print all objects
    println("######################################")
    println("Name: ${mySquare.name}\nLength: ${mySquare.length}\tHeight: ${mySquare.height}\nArea: ${mySquare.getArea()}")
    println("######################################")
    println("Name: ${myCircle.name}\nRadius: ${myCircle.radius}\nArea: ${myCircle.getArea()}")
    println("######################################")
    println("Name: ${myTriangle.name}\nSide a: ${myTriangle.a}\tSide b: ${myTriangle.b}\tSide c: ${myTriangle.c}\nArea: ${myTriangle.getArea()}")
    println("######################################")
    println("Name: ${myEquilateralTriangle.name}\nSide: ${myEquilateralTriangle.a}\nArea: ${myEquilateralTriangle.getArea()}")
}