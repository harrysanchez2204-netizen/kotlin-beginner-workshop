// Ejercicio 4. Análisis de una lista
// Conceptos: listOf, ciclos for, contadores, comparaciones.

fun main() {
    val numbers = listOf(12, 7, 3, 25, 8, 14, 1, 30, 9, 18, 5)

    println("Elementos de la lista:")
    for (n in numbers) {
        print("$n ")
    }
    println()

    var sum = 0
    var max = numbers[0]
    var min = numbers[0]
    var evenCount = 0
    var oddCount = 0

    for (n in numbers) {
        sum += n
        if (n > max) max = n
        if (n < min) min = n
        if (n % 2 == 0) evenCount++ else oddCount++
    }

    val average = sum.toDouble() / numbers.size

    println("Cantidad de elementos: ${numbers.size}")
    println("Suma: $sum")
    println("Promedio: ${"%.2f".format(average)}")
    println("Mayor: $max")
    println("Menor: $min")
    println("Pares: $evenCount")
    println("Impares: $oddCount")
}
