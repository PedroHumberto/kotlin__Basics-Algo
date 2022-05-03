
class Data(val dia: Int, val mes: Int, val ano: Int)

fun main(){
    val data1 = Data(31, 12, 2023)
       testeData(data1)
}

fun testeData(data: Data){
    //validando as datas
    if (data.mes == 2 && data.dia > 29) return println("DATA INVALIDA")
    if (data.dia > 31 || data.mes > 12) return println("DATA INVALIDA")

    var bissexto = false
    var mes = 1
    var dias = 0
    var somaDias = 0

    //A data se encontra em ano bissexto?
    if(data.ano % 4 == 0){
        bissexto = true
        println("Esse ano é bissexto")
    }else{
        if (!bissexto && data.dia > 28 && data.mes == 2) return println("DATA INVALIDA") //validação para ano bissexto
        println("Não é bissexto")

    }
    //Quantos dias têm o mês da data?
    when(data.mes){
        4,6,9,11 -> println("tem 30 Dias")
        //consulta se é ou não bissexto
        2 -> if (bissexto){
            println("29 Dias")
            }else {
                println("28 Dias")
            }
        //fim da consulta
        else -> println("Tem 31 Dias")
    }
    //Quantos dias existem entre o dia da data e o primeiro dia do ano inclusive?
    while(mes <= data.mes){
        when(mes) {
            4, 6, 9, 11 -> dias = 30
            2 -> dias = 28
            0 -> dias = 0
            else -> dias = 31
        }
            somaDias += dias

        mes++
    }

    var distanciaDias = somaDias - (dias - data.dia) - 1
    println("A distancia entre o dia primeiro até a data selecionada é de: $distanciaDias")
}
