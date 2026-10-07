// Ejercicio 5. Funciones matemáticas
// Conceptos: funciones con parámetros y tipo de retorno, expresiones de una línea, require().

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2..number / 2) {
        if (number % i == 0) return false
    }
    return true
}

fun factorial(number: Int): Long {
    require(number >= 0) { "El factorial solo está definido para números no negativos" }
    var result = 1L
    for (i in 2..number) {
        result *= i
    }
    return result
}

fun isEven(number: Int): Boolean = number % 2 == 0

fun main() {
    val numbers = listOf(0, 1, 7, 10, 13, 20)

    for (n in numbers) {
        println("Número: $n")
        println("  ¿Es primo? ${isPrime(n)}")
        println("  Factorial: ${factorial(n)}")
        println("  ¿Es par? ${isEven(n)}")
    }
}
