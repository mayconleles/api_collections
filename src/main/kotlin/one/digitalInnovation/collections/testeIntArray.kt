package one.digitalInnovation.collections

fun main() {
        val values = IntArray(5)

    values[0]= 1
    values[1]= 7
    values[2]= 8
    values[3]= 6
    values[4]= 5

 for (valor in values){
     println(valor)
 }
    println("-----------------*--------------")

values.forEach {
    println(it)
}
    println("-----------------*--------------")
    values.forEach {valor ->
        println(valor)
    }
    println("-----------------*--------------")
    for (Index in values.indices){
        println(values[Index])
    }

}