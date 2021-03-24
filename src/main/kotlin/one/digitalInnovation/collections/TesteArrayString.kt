package one.digitalInnovation.collections

fun main (){
    val nomes = Array<String>(6){""}
    val nomes2 = arrayOf("Matheus", "Bruna","gustavo")

    nomes[0] = "Maycon"
    nomes[1] = "Daniel"
    nomes[2] = "Alexandre"
    nomes[3] = "Laudiceia"
    nomes[4] = "Danilo"
    nomes[5] = "Samara"


  nomes.sort()

    println("E quem vai começar o debate é : ")

    nomes.forEach {
        println(it)
    }

    println("------------------------- ")


    nomes2.forEach { println(it) }
}
