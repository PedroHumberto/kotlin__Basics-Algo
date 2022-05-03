fun main() {
    println(fatorial(5))
}

fun fatorial(numero: Int): Int {
    var fatorial: Int = 1
    for (i in 1..numero) {
        // factorial = factorial * i;
        fatorial *= i
    }
    return fatorial
}