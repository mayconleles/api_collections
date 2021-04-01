package one.digitalInnovation.collections

fun main(){

    val joao = Funcionario("Joao" , 1000.00)
    val maria = Funcionario("Maria" , 1500.00)

    val funcionarios = listOf(joao,maria)

    funcionarios.forEach { println(it) }

}

data class Funcionario(
   var s: String,
   var d: Double
)