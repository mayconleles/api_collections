package one.digitalInnovation.collections

fun main(){
    val michael = Employee("michael",5600.00,"CLT")
    val maria = Employee("maria",4500.00,"CLT")
    val joao = Employee("joao",2500.00,"pj")
    val pedro = Employee("pedro",7000.00,"CLT")
    val matheus = Employee("matheus",1500.00,"pj")

    val employees1 = setOf(joao,pedro)
    val employees2 = setOf(michael,matheus)


    val result = employees1.union(employees2)
    result.forEach { println(it) }

    println("-----------------------------------------------------")
     val employees3 = setOf(michael,pedro,matheus,maria)
      val retSubtract = employees3.subtract(employees1)

    retSubtract.forEach { println(it) }
    println("-----------------------------------------------------")

    val resultIntersect = employees3.intersect(employees2)
    resultIntersect.forEach { println(it) }

}