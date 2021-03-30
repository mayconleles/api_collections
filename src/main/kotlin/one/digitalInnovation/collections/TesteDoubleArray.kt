package one.digitalInnovation.collections

fun main(){
    val salarios = DoubleArray(3)

    salarios[0] = 1500.00
    salarios[1] = 3500.00
    salarios[2] = 1900.00
    salarios.forEach { println(it)}

    println("-----------------------")



    salarios.forEachIndexed {index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("------------------------")

    var salarios2 = doubleArrayOf(1500.0,1600.35,1350.3)

    salarios2.forEachIndexed {index, salario2 ->
        salarios2[index] = salario2 * 1.1
    }

    salarios2.forEach { println(it) }

}