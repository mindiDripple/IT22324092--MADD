fun main() {
    val shapes: List<Shape> = listOf(Circle(), Rectangle())

    for (shape in shapes) {
        shape.setup()
        shape.draw()
    }
}
