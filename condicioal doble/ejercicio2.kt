fun main() {
 var valorcompra = 200.000
    var descuento:Double
    
    if(valorcompra >= 100.000){
        descuento = valorcompra * 0.5
        valorcompra -= descuento
		println("Se aplicó un descuento del 50% equivalente a: $descuento")
    } else {
		descuento = valorcompra * 0.1
		valorcompra -= descuento
		println("Se aplicó un descuento del 10% equivalente a: $descuento")
	}
        println("Valor Final: $valorcompra")	

    
}
