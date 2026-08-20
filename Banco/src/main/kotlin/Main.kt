fun main(){
    println("Crear clientes")
    val cliente = Cliente("Camilo Soto", "18.234.567-8")
    cliente.mostrarInformacion()

    println("Crear cuentas")
    //se llama al objeto cliente creado arriba
    val cuentaAhorro = CuentaAhorro(1001, cliente, 100000.0, 3.5)
    val cuentaCorriente = CuentaCorriente(2001, cliente, 300000.0,500000.0)

    cuentaAhorro.mostrarResumen()
    cuentaCorriente.mostrarResumen()

    println("Polimorfismo")

    val cuentas: List<CuentaBancaria> = listOf(
        cuentaAhorro,
        cuentaCorriente
    )
    for (cuenta in cuentas){
        println("--------------")
        cuenta.mostrarTipoCuenta()
    }

    println("Try Catch Finally")

    try{
        cuentaAhorro.retirar(500000.0)
        println("Operación de retiro realizada")
    } catch (error: SaldoInsuficienteException){
        println("Error: ${error.message}")
    }finally{
        println("Operación bancaria finalizada")
    }

    println("Programa no se detiene sigue funcionando")

    println("Tipos de Exception")

    //IllegalArgumentException
    try{
        cuentaAhorro.depositar(-20000.0)
    }catch (error: IllegalArgumentException){
        println("Error: ${error.message}")
    }finally {
        println("Prueba finalizada")
    }

    //Exception aritmetica
    try{
        val numeroA = 10
        val numeroB = 0

        val resultado = numeroA/numeroB
      //AritmeticException maneja errores de division como la division de un numero por 0
    } catch (error: ArithmeticException){
        println("Error matemático")
    } finally {
        println("Prueb matemática finalizada")
    }

    //Number Format Exception
    try{
        val texto = "ABC"
        val numero = texto.toInt()
        println(numero)
    //Error para cuando se espera un numero y el usuario pasa una cadena de texto
    }catch (error: NumberFormatException){
        println("El texto debe ser un número")
    }finally{
        println("Conversión finalizada")
    }

    //Index Out Of Bounds = Índice fuera de límites
    try{
        val nombres = listOf(
            "Ana",
            "Pedro",
            "Maria"
        )
        println(nombres[5])
    //IndexOutOfBounds es un tipo de error para cuando se llama a una posicion en especifico que no existe en la lista
    }catch (error : IndexOutOfBoundsException){
        println("Error: Posicion inexistente")
    }finally{
        println("Consulta finalizada")
    }

    //Null Pointer Exception = Excepciónn de puntero nulo
    try{
        //? para que pueda o no pueda tener un dato y si no lo tiene que lo deje como nulo
        val nombre : String? = null
        //Con !! se le dice a kotlin que la variable nombre no es nula y si es nula lanza el error
        println(nombre!!.length)
    }catch(error : NullPointerException){
        println("Error el valor es nulo")
    }finally{
        println("Prueba de null finalizada")
    }

    //Custom Exception
    //Es el tipo de error creado en la carpeta como clase, en este caso SaldoInsuficienteException
    try{
        cuentaAhorro.retirar(99999999.0)
    }catch(error: SaldoInsuficienteException){
        println("Banco Informa: ${error.message}")
    }finally{
        println("Intento de retiro finalizado")
    }

    //retiro interactivo
    try{
        println("Ingresa el monto a retirar: ")
        //readln() sirve para leer una linnea de texto introducida por el usuario desde la consola de kotlin
        val entrada = readln()
        val monto = entrada.toDouble()
        cuentaAhorro.retirar(monto)
        println("Saldo restante: $ ${cuentaAhorro.obtenerSaldo()}")
    }catch(error: NumberFormatException){
        println("Tipo de dato inválido")
    }catch (error: IllegalArgumentException){
        println("Monto incorrecto")
    }catch (error: SaldoInsuficienteException){
        println("Operación rechazada: ${error.message}")
    }finally{
        println("Gracias por utilizar BancoApp")
    }

    println("Programa Finalizado")

}