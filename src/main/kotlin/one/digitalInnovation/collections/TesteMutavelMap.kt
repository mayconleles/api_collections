package one.digitalInnovation.collections

fun main (){

    val michael = Employee("michael",5600.00,"CLT")
    val maria = Employee("maria",4500.00,"CLT")
    val joao = Employee("joao",2500.00,"pj")
    val pedro = Employee("pedro",7000.00,"CLT")
    val matheus = Employee("matheus",1500.00,"pj")


    val repository = Repositorio<Employee>()

    repository.create(joao.name,joao)
    repository.create(michael.name,michael)
    repository.create(maria.name,maria)
    repository.create(pedro.name,pedro)
    repository.create(matheus.name,matheus)
    println(repository.findById(joao.name))
    println(repository.findById(maria.name))

    println("--------------------------------")
    repository.findAll().forEach { println(it) }

    println("--------------------------------")
    repository.remove(joao.name)
    repository.findAll().forEach { println(it) }

}