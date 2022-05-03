
fun main(){
    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    maiorque(triangulo)
    maiorque(fibonacci)
}

fun maiorque(lista: List<Int>){
    if(lista[0] > lista.last()){
        println("Tenfni")
    }else{
        println("Infnet")
    }

}




