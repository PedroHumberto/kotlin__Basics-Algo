class Data(val dia: Int, val mes: Int, val ano: Int) {
    var bissexto: Boolean = false
    init {
        if(ano % 4 == 0){
            bissexto = true
        }
    }
    init {
        if (dia > 31 || mes > 12) {
            throw AssertionError("Data Invalida")
        }
        if(mes == 2 && dia > 29){
            throw AssertionError("Data Invalida")
        }
        if (!bissexto && dia > 28 && mes == 2){
            throw AssertionError("Data Invalida")
        }
    }

    fun anoBissexto() {
        if (bissexto){
            println("ano bissexto")
        }
        else{
            println("Não é Bissexto")
        }
    }

    fun qtDias(){
        when(mes){
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
    }
    fun contagemDias(){
        var dias: Int = 0
        var somaDias: Int = 0
        var contMes: Int = 1
        while(contMes <= mes){
            when(contMes) {
                4, 6, 9, 11 -> dias = 30
                //validação
                2 -> if (bissexto) dias = 29
                else dias = 28
                //fim validação
                else -> dias = 31
            }
            somaDias += dias

            contMes++
        }

        var distanciaDias = somaDias - (dias - dia) - 1
        println("A distancia entre o dia 01/01/$ano até a data selecionada é de: $distanciaDias dias")

    }

}
fun main(){
    val data1 = Data(31, 12, 2024)

    data1.anoBissexto()
    data1.qtDias()
    data1.contagemDias()


}
