fun main() {
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)


    println("A soma dos numeros pares do triangulo é ${somaPar(triangulo)}")
    println("O produto dos numeros impares do triangulo é ${produto(triangulo)}")
    println("-----")
    println("A soma dos numeros pares do fibonacci é ${somaPar(fibonacci)}")
    println("O produto dos numeros impares do fibonacci é ${produto(fibonacci)}")


}

fun somaPar(lista: List<Int>): Int {
    var soma: Int = 0

    for(number in lista){
        if(number %  2 == 0){
            soma += number
        }
    }
    return soma
}

fun produto(lista: List<Int>): Int {
    var produto: Int = 1

    for(number in lista){
        if(number %  2 == 1){
            produto *= number
        }
    }
    return produto
}