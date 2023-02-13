fun main() {
 print("Ingrese la cantidad de personas a saludar: ") 
val cantidadPersonas = 
 var contador = 1 
while (contador <= cantidadPersonas){
 print("Ingrese el nombre de la persona $contador: ") 
val nombre = readLine()!! println("Hola $nombre, ¡Bienvenido!") 
contador++
 }
 }
