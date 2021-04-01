package one.digitalInnovation.collections

fun main(){
    val wage = doubleArrayOf(1000.0,2250.00,4400.00)
    for (i in wage ){
        println(i)
    }
    println("----------//----------")
    println("the max wage : ${wage.maxOf { d: Double -> d }}")
    println("the minimum wage : ${wage.minOf { d: Double -> d }}")
    println("the average wages is : ${wage.average()}")

    val wagesFilter =  wage.filter {  d: Double -> d > 2500  }
    println("-----------------------")
    wagesFilter.forEach { println(it) }
    println("-----------------------")
    println(wage.count{it in 2000.00..5000.00 })

    println("-----------------------")

    println(wage.find{it == 2250.00 })

    println("-----------------------")
    println(wage.any{it == 1000.0 })
    println("-----------------------")
    println(wage.any{it == 500.0 })
}
