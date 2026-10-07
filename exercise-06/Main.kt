// Ejercicio 6. Gestión de productos
// Conceptos: clases, constructor primario, propiedades, métodos, instancias de objetos.

class Product(val name: String, val price: Double, val quantity: Int) {

    fun totalValue(): Double = price * quantity

    fun showInfo() {
        println("Producto: $name")
        println("  Precio unitario: $${"%.2f".format(price)}")
        println("  Cantidad disponible: $quantity")
        println("  Valor total del inventario: $${"%.2f".format(totalValue())}")
    }
}

fun main() {
    val products = listOf(
        Product("Teclado", 85000.0, 10),
        Product("Mouse", 45000.0, 25),
        Product("Monitor", 620000.0, 4)
    )

    for (product in products) {
        product.showInfo()
        println()
    }

    var inventoryTotal = 0.0
    for (product in products) {
        inventoryTotal += product.totalValue()
    }
    println("Valor total de todo el inventario: $${"%.2f".format(inventoryTotal)}")
}
