fun main() {

    println("Ingresa x1:")
    val x1 = readLine()!!.toInt()

    println("Ingresa y1:")
    val y1 = readLine()!!.toInt()

    println("Ingresa x2:")
    val x2 = readLine()!!.toInt()
 
    println("Ingresa y2:")
    val y2 = readLine()!!.toInt()

    val distanciaX = x2 - x1
    val distanciaY = y2 - y1

    println("La distancia en X es: $distanciaX")
    println("La distancia en Y es: $distanciaY")
}