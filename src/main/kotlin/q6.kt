fun main() {
    val list1: List<Int> = listOf(7,13,33,44,37,32,68,13)


    println(escondePar(list1))

}

fun escondePar(lista: List<Int>): List<Int> {
    var list2 = listOf<Int>()
    for (i in lista.indices) {

        var par = lista.get(i)
        if (par % 2 == 0 ) {
            list2 += 1
        }else{
            list2 += i
        }
    }
    return list2
}