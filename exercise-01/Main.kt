// Ejercicio 1. Calculadora básica
// Conceptos: val, tipos Double/Char, when como expresión, if como expresión, funciones.

fun calculate(a: Double, b: Double, operation: Char): String = when (operation) {
    '+' -> "$a + $b = ${a + b}"
    '-' -> "$a - $b = ${a - b}"
    '*' -> "$a * $b = ${a * b}"
    '/' -> if (b == 0.0) {
        "Error: no se puede dividir entre cero"
    } else {
        "$a / $b = ${a / b}"
    }
    else -> "Operación no válida: '$operation'"
}

fun main() {
    val firstNumber = 12.0
    val secondNumber = 4.0
    val operation = '/'

    println(calculate(firstNumber, secondNumber, operation))

    // Pruebas adicionales
    println(calculate(10.0, 3.0, '+'))
    println(calculate(10.0, 3.0, '-'))
    println(calculate(10.0, 3.0, '*'))
    println(calculate(10.0, 0.0, '/'))   // división entre cero controlada
    println(calculate(10.0, 3.0, '%'))   // operación inválida
}
