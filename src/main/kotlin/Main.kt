class Main {
    //Fun main: Es el punto de entrada del código
    fun main(){

        //Uso variable String para el nombre del producto
        val nombreProducto: String = "Teclado"
        //Uso de variable int para la cantidad
        var cantidad: Int = 2
        val precio: Double = 29990.0
        val disponible: Boolean = true
        //Char para almacenar un simbolo o carácter individual
        val categoria: Char = 'T'
        val total = precio * cantidad

        println("==========")
        println("PRODUCTO")
        println("==========")
        println("Producto: $nombreProducto")
        println("Precio: $precio")
        println("Cantidad: $cantidad")
        println("Disponible: $disponible")
        println("Categoria: $categoria")
        println("Total: $total")




    }

}