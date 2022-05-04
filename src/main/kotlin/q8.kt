fun main(){
    val listaDeElemento: List<Int> = listOf(1,2,3,4,5,6)
    val vazio = listOf<Int>()

    //O metodo get pode ser utilizado em uma lista quando você quer acessar um elemento através de seu Index
    //Caso você queira pegar o numero 2 da lista você utiliza seu index que é 1 Ex:
    val item1 = listaDeElemento.get(1)
    println("O elemento pego é o $item1")

    //Metodo isEmpty
    //Você pode usar para validar uma lista, se ela contem informações ou não, caso não você pode descarta-la
    if (vazio.isEmpty()){
        println("A lista esta vazia")
    }
    else{
        println("A lista está preenchida")
    }

    //droplast
    /* Em caso de você querer acessar um item no final de uma lista, como por exemplo você uma pilha de itens
    quando for remover um desses itens, o ultimo item deve sair primeiro. No caso do exemplo o item 6*/


    println(listaDeElemento.dropLast(1))

}