fun main(){
    val notas = listOf(5.5, 3.2, 6.1, 4.0, 2.8, 5.9, 3.9, 6.5)

    //For mostrará la lista creada de val notas mediante nota in
    for (nota in notas){
        println(nota)
    }

    val estaAprobado: Boolean = true
    val nota: Double = 4.0

    if (nota >= 4.0){
        println("Aprobado")
    }

    //Con filter se puede filtrar las notas aprobadas, esto indicandole con el uso de it que sea mayor o igual a 4.0, entonces estaría mostrando
    //solo las notas mayores a 4.0 usando el println(notasAprobadas).
    val notasAprobadas = notas.filter {it >= 4.0}
    println("Todas las notas: $notas")
    println("Notas aprobadas: $notasAprobadas")

    val notasReprobadas = notas.filter {it < 4.0}
    println("Todas las notas: $notas")
    println("Notas reprobadas: $notasReprobadas")

    //Con average se puede ver el promedio de todas las notas de la lista sin la necesidad de usar algun tipo de calculo matematico
    val promedio = notas.average()
    println("Notas: $notas")
    println("Promedio: $promedio")

    //Any toma la lista y busca si hay algun valor que tenga la condición que se le indica
    val hayAprobados = notas.any {it >= 4.0}
    println("Notas aprobadas: $hayAprobados")

    //All sirve para verificar si todos los elementos de una lista cumplen con una condicion especifica
    //Devuelve un valor booleano true solo si el 100% de los elementos cumplen con esa condicion, en caso contraria si almenos falla una dará false
    val grupoA = notas.all{it >= 4.0}
    println("¿Todos los estudiantes aprobaron?: $grupoA")

    //Find sirve para buscar y devolver el primer elemento de una lista que cumpla con una condición
    //Si encuentra un elemento, te devuelve el valor de ese elemento. Si ninguno cumple la condición devuelve null
    val primeraNota = notas.find { it < 4.0 }
    println("La primera nota inferior a 4.0 es $primeraNota")

    //Map sirve para transformar cada elemento de una lista en algo diferente, creando una nueva lista con los resultados modificados
    val notasModificadas = notas.map{it + 0.5}
    println("Notas modificadas: $notasModificadas")




}