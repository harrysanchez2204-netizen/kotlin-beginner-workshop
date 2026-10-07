// Ejercicio 2. Clasificación de estudiantes
// Conceptos: variables, operaciones con Double, condicionales if/else, plantillas de texto.

fun classify(name: String, grade1: Double, grade2: Double, grade3: Double) {
    val average = (grade1 + grade2 + grade3) / 3

    println("Estudiante: $name")
    println("Notas: $grade1, $grade2, $grade3")
    println("Promedio: ${"%.2f".format(average)}")

    if (average >= 3.0) {
        println("Estado: APROBADO")
    } else {
        println("Estado: REPROBADO")
    }

    if (average >= 4.5) {
        println("Promedio excelente")
    }
    println()
}

fun main() {
    val studentName = "Javier Alzate"
    val grade1 = 4.8
    val grade2 = 4.5
    val grade3 = 4.4

    classify(studentName, grade1, grade2, grade3)

    // Otros casos de prueba
    classify("Ana", 3.0, 3.2, 2.9)    // aprobada, sin excelencia
    classify("Luis", 2.0, 2.5, 3.0)   // reprobado
}
