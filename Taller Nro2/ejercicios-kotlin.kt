//Crea un par que asocie un nombre de una fruta con su precio y muestra sus elementos por pantalla.
fun main() {
    val frutaPrecio = Pair("Manzana", 2.5)
    println("La ${frutaPrecio.first} cuesta ${frutaPrecio.second} euros.")
}

//Crea un mapa que asocie nombres de países con sus capitales y muestra sus elementos por pantalla.
fun main() {
    val capitales = mapOf(
        "España" to "Madrid",
        "Francia" to "París",
        "Italia" to "Roma",
        "Alemania" to "Berlín"
    )
    for ((pais, capital) in capitales) {
        println("La capital de $pais es $capital")
    }
}

//Crea un conjunto de números y muestra sus elementos por pantalla.
fun main() {
    val numeros = setOf(5, 8, 3, 1, 5, 8, 2)
    for (numero in numeros) {
        println(numero)
    }
}

//Crea una lista de strings y muestra sus elementos por pantalla.
fun main() {
    val nombres = listOf("Juan", "María", "Pedro", "Ana")
    for (nombre in nombres) {
        println(nombre)
    }
}