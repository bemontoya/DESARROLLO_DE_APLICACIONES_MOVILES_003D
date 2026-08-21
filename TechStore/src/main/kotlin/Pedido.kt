class Pedido(
    val cantidad: Int,
    //Los atributos heredados van sin el val o var
    nombre: String,
    precio: Double,
    stock: Int
) : Producto(nombre, precio, stock) {

    //Como precio es double y cantidad int deben llamarse coimo parametros conn su tipo de dato y convertirlos con : Double

    fun calcularTotal(precio: Double, cantidad: Int): Double {
        // 1. Validar que el precio sea válido
        if (precio <= 0) {
            throw IllegalArgumentException("El precio debe ser un número positivo mayor a 0.")
        }

        // 2. Validar que la cantidad sea válida
        if (cantidad <= 0) {
            throw IllegalArgumentException("La cantidad debe ser mayor a 0.")
        }

        // 3. Si todo está bien, realiza el cálculo
        return precio * cantidad
    }

    fun procesarCompra(cantidad: Int, precio: Double, stock: Int): Double {
        //Validaciones que lanzan excepciones si algo sale mal
        if (cantidad <= 0) {
            //IllegalArgumentException sirve para cuando se pasa un numero que es menor a 0, como un -1 por ejemplo
            throw IllegalArgumentException("La acantidad a comprar debe ser mayor a 0")
        }

        if (cantidad > stock) {
            //IllegalStateException sirve para lanzar una excepcion si el stock es menor a la cantidad de la compra
            throw IllegalStateException("Stock insuficiente. Stock disponible : $stock")
        }
        return precio * cantidad
    }
}

