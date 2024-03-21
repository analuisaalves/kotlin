fun main( ) {

println("Ex:. 1: ")
/* Para usar if, adicione a expressão condicional entre parênteses ()
e a ação a ser executada se o resultado for verdadeiro entre chaves {} */ 
println("")

val d: Int
val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d)

println("Ex:.2: ")
/*Não há operador ternário condition ? then : elseem Kotlin.
Em vez disso, ifpode ser usado como uma expressão. Ao usar if como expressão, não há chaves {} */
println("")

val a = 1
val b = 2

println(if (a > b) a else b)

println("Ex:. 3: when/quando")
/*Coloque a expressão condicional entre parênteses ()e as ações a serem executadas entre chaves {}.
Use ->em cada ramificação para separar cada condição de cada ação. */
println("")

val obj = "hello"

when (obj) {
    // Verifica se obj é igual a "1"   
    "1" -> println("um")
    // Verifica se obj é igual a "ola"
    "olá" -> println("Saudação")
    //Instrução padrão
    else -> println("Desconhecido") 
    }

println("Exemplo 4: when como expressão")
println("")

val obj1 = "olá"

val resultado1 = when ( obj1 ) {
    //Se obj1 for igual a "1", define o resultado como "um"
    "1" -> "Um"
    // Se obj1 for igual a "ola", define o resultado como "Saudação"
    "olá" -> "Saudação"
    // Caso contrário, define o resultado como "Desconhecido"
    else -> "Desconhecido"
}
println(resultado1)

println("Exemplo 5:when/expressões booleanas")
println("")

val temp = 18
val descrição = when {
    // Verifica se temp é menor que 0, define a descrição como "muito frio"
    temp < 0 -> "muito frio"
    // Verifica se temp é maior ou igual a  0 e menor que 10,define a descrição como "frio"
    temp < 10 -> "um pouco frio"
    // verifica se temp  é maior ou igual a 10 e menor que 20, define a descrição como
    temp < 20 -> "quente"
    // Senão, define a descrição como "quente"
    else -> "quente"
}
println(descrição)

println("Exemplo 6:Rotações")
println("")

for (number in 1..5) { 
    print(number)
}

println("Exemplo 7: ")
println("")

val cakes = listOf("cenoura", "morango", "chocolate")

for (cake in cakes) {
    println("Que delícia é um bolo de $cake !")
}

println("Exemplo 8:while/enquanto ")
println("")

var cakesEaten = 0
while (cakesEaten < 3) {
    println("coma um bolo")
    cakesEaten++
}

println("Exemplo 9:do-while ")
println("")

var cakesEaten1 = 0
var cakesBaked1 = 0
while (cakesEaten1 < 3) {
    println("Coma um bolo")
    cakesEaten1++
}
do {
    println("Fazer um bolo")
    cakesBaked1++
} while (cakesBaked1 < cakesEaten1)

}