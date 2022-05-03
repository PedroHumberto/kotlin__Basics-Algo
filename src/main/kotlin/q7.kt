fun main(){
    var cafe = "cafe"
    var infnet = "infnet"
    var abacaxi = "abacaxi"
    var pneumoultramicroscopicosilicovulcaniconiótico = "pneumoultramicroscopicosilicovulcaniconiótico"
    var e = "e"


    println("Café = ${hashString(cafe)}")
    println("infnet = ${hashString(infnet)}")
    println("abacaxi = ${hashString(abacaxi)}")
    println("pneumoultramicroscopicosilicovulcaniconiótico = ${hashString(pneumoultramicroscopicosilicovulcaniconiótico)}")
    println("e = ${hashString(e)}")

}

fun hashString(palavra: String): Int {
    var soma = 0
    for (letras in palavra){
        var valorDasLetras = letras.code - 96
        var posicao = palavra.indexOf(letras) + 1
        soma += valorDasLetras * posicao

    }
    return soma
}