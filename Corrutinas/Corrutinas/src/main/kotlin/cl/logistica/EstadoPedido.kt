package cl.logistica

sealed class EstadoPedido {
    object Cargando: EstadoPedido()

    data class Exito(val mensaje: String) : EstadoPedido()
    data class Error(val motivo: String) : EstadoPedido()

}