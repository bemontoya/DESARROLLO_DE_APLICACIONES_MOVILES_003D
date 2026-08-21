fun main() {

    val pedido = Pedido(2, "Teclado Mecánico", 79980.0, 8)

    println("=== TECHSTORE ===")

    // 1. Probar calcularTotal
    try {
        val totalCalculado = pedido.calcularTotal(30000.0, 2)
        println("Cálculo de total: $$totalCalculado")
    } catch (e: IllegalArgumentException) {
        println("Error al calcular total: ${e.message}")
    }

    println("----------------------------")

    // 2. Probar procesarCompra
    try {
        // Ejemplo pasando cantidad = 3, precio = 79980.0, stock = 8 (tomado del objeto)
        val totalCompra = pedido.procesarCompra(cantidad = 3, precio = pedido.precio, stock = pedido.stock)
        println("Compra procesada con éxito. Total a pagar: $$totalCompra")

    } catch (e: IllegalArgumentException) {
        // Captura si ingresan cantidades menor o igual a 0
        println("Error de entrada: ${e.message}")

    } catch (e: IllegalStateException) {
        // Captura si la cantidad supera el stock disponible
        println("Error de estado (Stock): ${e.message}")

    } catch (e: Exception) {
        // Captura cualquier otro error no previsto
        println("Error inesperado: ${e.message}")
    }

    println("\n=== FIN DEL PROCESO ===")
}