//open = permite que otras clases puedan heredar
open class CuentaBancaria (
    val numeroCuenta: Int,
    //Se llama a cliente por su clase, propietario de la cuenta
    val cliente: Cliente,
    val saldoInicial : Double
) {
    //El saldo solo puede modificarse dentro de esta clase
    private var saldo : Double = saldoInicial

    //Funcion para consultar el saldo
    fun obtenerSaldo():Double{
        return saldo
    }

    //Funcion para depositar dinero a la cuenta
    fun depositar(monto: Double){
        //validar el monto
        if(monto <= 0){
            //Generar una excepción
            throw IllegalArgumentException("El depósito debe ser mayor a 0")
        }

        //Aumentar el saldo
        saldo += monto
        println("Depósito realizado: $ $monto")
    }

    //Funcion para retirar dinero
    fun retirar(monto: Double){
        //Validar que el monto sea válido
        if(monto <= 0){
            throw IllegalArgumentException("El depósito debe ser mayor a 0")

        }
        //Validar que tengamos dinero para hacer retiro
        if (monto > saldo){
            throw SaldoInsuficienteException("Saldo insuficiente para retirar $monto")
        }
        //Descontar dinero si no pasa ninguna de las dos excepciones
        saldo -= monto
        println("Retiro realizado: $ $monto")
    }

    //Método que puede cambiar en las clases hijas = Polimorfismo
    open fun mostrarTipoCuenta(){
        println("Cuenta Bancaria")
    }

    //Muestra un resumen
    fun mostrarResumen(){
        println("-----------Cuenta-----------")
        println("Número: $numeroCuenta")
        //Para acceder al nombre del cliente llamandolo desde la otra clase se deben usar las {}
        println("Cliente: ${cliente.nombre}")
        println("Saldo: ${saldo}")
    }



}