// Ejercicio 3. Tabla de multiplicar
// Conceptos: ciclo for con rangos (1..10), acumuladores con var.

fun main() {
    val number = 7

    println("Tabla de multiplicar del $number")
    var total = 0

    for (i in 1..10) {
        val result = number * i
        println("$number x $i = $result")
        total += result   // modificación: acumular la suma de los resultados
    }

    println("Suma de todos los resultados: $total")
}
