const val PI = 3.14

fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

fun calculateCircumference(radius: Double): Double {
    return 2 * PI * radius
}

fun main() {
    val radius = 5.0
    println("Radius: $radius")
    println("Area: ${calculateArea(radius)}")
    println("Circumference: ${calculateCircumference(radius)}")
}
