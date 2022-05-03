fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    println(maiornumero(triangulo))
    println(maiornumero(fibonacci))

}

fun maiornumero(lista: List<Int>): Int {
    var maior: Int = 0
    for (number in lista ){
        if (number > maior ) {
            maior = number
        }
    }
    return (maior)
}