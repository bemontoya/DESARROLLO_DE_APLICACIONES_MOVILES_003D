//La palabra open permite que otra clase pueda heredad a esta clase o incluso un método como el método open fun presentarse.
open class Persona (
    val nombre: String,
    val edad: Int
){
    open fun presentarse(){
        println("Hola, mi nombre es: ${nombre} ")
    }

}