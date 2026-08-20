class CuentaCorriente (
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    //Valor unico de esta cuenta
    val limiteDeTransferencia: Double
) : CuentaBancaria(
    numeroCuenta,
    cliente,
    saldoInicial
){
    //Polimorfismo
    //Cambiar el comportamiento heredado
    override fun mostrarTipoCuenta() {
        println("Cuenta Corriente")
        println("Límite de transferencia $ $limiteDeTransferencia")
    }

}