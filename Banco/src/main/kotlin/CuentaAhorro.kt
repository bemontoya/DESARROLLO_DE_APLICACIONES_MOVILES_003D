class CuentaAhorro (
    numeroCuenta: Int,
    cliente: Cliente,
    saldoInicial: Double,
    val tasaInteres: Double
): //Lo que se está heredando
    CuentaBancaria(
    numeroCuenta,
    cliente,
    saldoInicial
){
    //Sobreescribir el metodo padre = override
    override fun mostrarTipoCuenta() {
        println("Cuenta de ahorro")
        println("Tasa de interes: $tasaInteres")
    }
}