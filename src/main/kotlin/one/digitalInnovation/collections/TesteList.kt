package one.digitalInnovation.collections

fun main(){

    val joao = Funcionario("Joao" , 1000.00 , "CLT")
    val maria = Funcionario("Maria" , 10000.00 , "PJ")
    val pedro = Funcionario("pedro" , 2500.00 , "CLT")

    val funcionarios = listOf(joao,maria,pedro)

    funcionarios
        .forEach { println(it) }
    println("-------------------------------------")

    funcionarios
        .sortedBy { it.d  }
        .forEach { println(it) }
    println("-------------------------------------")
    funcionarios
        .groupBy { it.tipo }
        .forEach { println(it) }


}

data class Funcionario(
   var s: String,
   var d: Double,
   var tipo:String
)