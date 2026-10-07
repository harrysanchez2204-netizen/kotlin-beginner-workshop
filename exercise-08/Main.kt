// Ejercicio 8. Manejo de valores nulos
// Conceptos: tipos nullable (String?), safe call (?.), isNullOrBlank, operador elvis (?:), sin !!.

fun greet(username: String?): String {
    return if (username.isNullOrBlank()) {
        "¡Hola, visitante!"
    } else {
        "¡Hola, ${username.trim()}! Bienvenido."
    }
}

fun main() {
    val testValues: List<String?> = listOf("Javier", null, "", "   ", "  Ana  ")

    for (value in testValues) {
        println("Entrada: ${value?.let { "\"$it\"" } ?: "null"}")
        println("  -> ${greet(value)}")
    }

    // Safe call + elvis: longitud del nombre o 0 si es null
    val maybeName: String? = null
    println("Longitud: ${maybeName?.length ?: 0}")
}
