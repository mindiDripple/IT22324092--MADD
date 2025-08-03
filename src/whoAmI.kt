fun whoAmI(value: Any): String {
    return value::class.simpleName ?: "Unknown"
}

fun main() {
    println("parameter of 6 : ${whoAmI(6)}")
    println("parameter of 10.5: ${whoAmI(10.5)}")
    println("parameter of 'Mindi': ${whoAmI("Mindi")}")
    println("parameter of true: ${whoAmI(true)}")
    println("parameter of listOf(44,55,66,77): ${whoAmI(listOf(44,55,66,77))}")
}