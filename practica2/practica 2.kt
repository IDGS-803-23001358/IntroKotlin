fun main() {

    println("Ingresa el valor de A:")
    val a = readLine()!!.toInt()

    println("Ingresa el valor de B:")
    val b = readLine()!!.toInt()

    var resultado = 0

    for(i in 1..b){
        resultado = resultado + a
    }

    println("La multiplicación de $a por $b es: $resultado")
}