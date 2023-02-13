fun main() {
 var cantidadEstudiantes: Int var sumaPromedios = 0.0
 println("Ingrese la cantidad de estudiantes: ") 
cantidadEstudiantes = readLine()!!.toInt()
 for (i in 1..cantidadEstudiantes) {
 println("Ingrese el promedio del estudiante $i: ")
 var promedio = readLine()!!.toDouble()
 sumaPromedios += promedio }
 var promedioTotal = sumaPromedios / cantidadEstudiantes 
println("Cantidad de estudiantes procesados: $cantidadEstudiantes") 
println("Promedio total de los promedios: $promedioTotal")
 }
