fun main() {
    val num1 = 10
    val num2 = 10

    println("Selecciona la operación a realizar:")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    val operation = 20

    when (operation) {
        1 -> println("El resultado es: ${num1 + num2}")
        2 -> println("El resultado es: ${num1 - num2}")
        3 -> println("El resultado es: ${num1 * num2}")
        else -> print("No es ninguno de los límites")
    }
    
}
