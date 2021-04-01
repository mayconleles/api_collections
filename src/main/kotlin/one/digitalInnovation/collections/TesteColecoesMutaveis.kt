package one.digitalInnovation.collections

fun main(){

    val joao = Funcionario("Joao" , 1000.00 , "CLT")
    val maria = Funcionario("Maria" , 10000.00 , "PJ")
    val pedro = Funcionario("pedro" , 2500.00 , "CLT")

  val functionaries = mutableListOf(joao,maria)
    functionaries.forEach { println(it) }


    println("----------ADD-----------")
    functionaries.add(pedro)
    functionaries.forEach { println(it) }


    println("--------REMOVE-----------")
    functionaries.remove(maria)
    functionaries.forEach { println(it) }

    println("--------SET-----------")
    var functionariesSet = mutableSetOf(joao)
    functionariesSet.forEach { println(it) }

    println("--------ADD NEWS-----------")
    functionariesSet.add(maria)
    functionariesSet.add(pedro)
    functionariesSet.forEach { println(it) }


}