package one.digitalInnovation.collections

fun main(){
 val values  = intArrayOf(2,5,7,6,7,8)


    values.forEach {
        println(it)
    }

    println("--------------------")

    values.sort()
    for (value in values) {
        println(value)
    }

    println("--------------------")
}
