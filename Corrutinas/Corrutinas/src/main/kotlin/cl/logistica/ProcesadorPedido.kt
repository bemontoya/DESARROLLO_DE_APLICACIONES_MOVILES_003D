package cl.logistica

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

object ProcesadorPedido {

    private suspend fun consultarStock(pedido: Pedido): Boolean{
        println("Consultando el inventario...")
        //Delay se mide en milisegundos
        delay(10000)
        return pedido.cantidad <= 5
    }
    private suspend fun autorizarPago(): Boolean{
        println("Autorizando pago...")
        delay(5000)
        return true
    }

    suspend fun procesar(pedido: Pedido): EstadoPedido = coroutineScope {
        val stockPendiente = async {
            consultarStock(pedido)
        }

        val pagoPendiente = async{
            autorizarPago()
        }

        val hayStock = stockPendiente.await()
        val pagoAprobado = pagoPendiente.await()

        when {
            !hayStock ->
                EstadoPedido.Error("No hay stock suficiente")

            !pagoAprobado ->
                EstadoPedido.Error("El pago fué rechazado")

            else ->
                EstadoPedido.Exito("Pedido ${pedido.id} aprovado")
        }
    }
}