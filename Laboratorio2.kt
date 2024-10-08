// Inciso 1 - Funcion calcularPromedio
fun calcularPromedio(numeros: List<Int>): Double {
    val suma = numeros.reduce { acc, num -> acc + num }
    return suma.toDouble() / numeros.size
}

// Inciso 2 - Filtrar numeros impares
val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val impares = numeros.filter { it % 2 != 0 }

// Inciso 3 - Funcion compacta isPalindrome
fun isPalindrome(cadena: String): Boolean {
    return cadena == cadena.reversed()
}

// Inciso 4 - Agregar saludo a nombres
val nombres = listOf("Andre", "Sofia", "Peter", "Morgan")
val saludos = nombres.map { "¡Hola $it!" }

// Inciso 5 - Funcion performOperation
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Inciso 6 - Clases Person y Student y funcion de mapeo
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapPersonToStudent(person: Person, studentId: String): Student {
    return Student(person.name, person.age, person.gender, studentId)
}

// Funcion main para demostrar el funcionamiento
fun main() {
    println(">>>>>>>>>>>> EJERCICIO #1 <<<<<<<<<<<<")
    println()
    
    val listaNumeros = listOf(10, 20, 30, 40, 50)
    println("Promedio: ${calcularPromedio(listaNumeros)}")
    
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    println(">>>>>>>>>>>> EJERCICIO #2 <<<<<<<<<<<<")
    println()
    println("Numeros Impares: $impares")
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    println(">>>>>>>>>>>> EJERCICIO #3 <<<<<<<<<<<<")
    println()
    val palabra = "oso"
    println("¿$palabra es un palindromo? ${isPalindrome(palabra)}")
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    println(">>>>>>>>>>>> EJERCICIO #4 <<<<<<<<<<<<")
    println()
    println("Saludos: $saludos")
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    println(">>>>>>>>>>>> EJERCICIO #5 <<<<<<<<<<<<")
    println()
    val resultadoSuma = performOperation(5, 3) { x, y -> x + y }
    println("Suma: $resultadoSuma")
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()

    println(">>>>>>>>>>>> EJERCICIO #6 <<<<<<<<<<<<")
    println()
    val personas = listOf(
        Person("Carlos", 20, "M"),
        Person("Ana", 22, "F")
    )
    val estudiantes = personas.map { mapPersonToStudent(it, "ID${it.name.take(3).uppercase()}") }
    estudiantes.forEach { println("Estudiante: ${it.name} Edad: ${it.age} años") }
    println()
    println(">>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<")
    println()
}