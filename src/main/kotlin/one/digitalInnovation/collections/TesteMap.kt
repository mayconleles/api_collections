package one.digitalInnovation.collections

fun main(){

    val pair: Pair<String,Double> = Pair("Joao",1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("chave: $k -> valor $v")}

    val map2 = mapOf(
        "pedro" to 25900.00,
        "Maria" to 59000.00
    )

    map2.forEach { (t, u) -> println("chave : $t -> valor $u ")}
}