class Empleado (
    val puesto : String,
    //El uso de private acá indica que solo está clase tiene permitido acceder a salario, principio de encapsulamiento para la mantener la integridad de datos.
    private val salario : Double,
    nombre : String,
    edad : Int
): Persona(nombre, edad){

    fun mostrarPuesto(){
        println("${nombre} trabaja como ${puesto}")
    }

    //Se sobreescribe el método presentarse ya que el metodo actuará de forma diferente dependiendo del objeto que lo llama
    override fun presentarse() {
        println("Hola, soy ${nombre} y mi puesto es ${puesto}")


    }


}
