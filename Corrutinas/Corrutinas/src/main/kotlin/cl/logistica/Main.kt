package cl.logistica

import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun mostrarEstado(estado: EstadoPedido){
    when (estado) {
        EstadoPedido.Cargando ->
            println("Estado: Procesando pedido...")
        is EstadoPedido.Exito ->
            println("Estado: ${estado.mensaje}")

        is EstadoPedido.Error ->
            println("Estado: Error - ${estado.motivo}")
    }
}

fun main() = runBlocking {
    println("BIENVENIDO A POLLO LISTO")

    val pedido = Pedido(
        id = "PED-84374387",
        producto = "Pollito asado con papitas",
        cantidad = 2,
        emailCliente = "cliente@pollolisto.cl"

    ).apply {
        envioExpress = true
    }
    println("Pedido creado apply: $pedido")

    //let evalúa si hay un correo
    pedido.emailCliente?.let(){ email ->
        println("Confirmación de pedido enviada a: $email")
    }

    mostrarEstado(EstadoPedido.Cargando)

    val tiempo = measureTimeMillis {
        val estadoFinal = ProcesadorPedido.procesar(pedido)
        mostrarEstado(estadoFinal)
    }

    println("Tiempo total: $tiempo milisegundos")

}