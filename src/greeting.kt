fun greetings(name: String, age: Int) {
    println("Hi, $name! You are $age years old.")
    if (age >= 18) {
        println("You are eligible for a driving license.")
    } else {
        println("Sorry, you are not eligible for a driving license.")
    }
}

fun main() {
    greetings("Varad", 17)
    greetings("Radya", 20)
}
