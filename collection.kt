fun main(  ) {

    println("Exemplo 1: ")
    println("")

    val readOnlyShapes = listOf ("triângulo" , "quadrado" , "círculo") // val declara a variavel chamada de ReadOnlyShapes
    println (readOnlyShapes)
    // imprimir tudo que esta no listOf

    //lista mutável com declaração de tipo explícita
    val shapes : MutableList<String> = mutableListOf ("triângulo" , "quadrado" , "círculo") 
    println(shapes)

    println("Exemplo 2: ")
    println("")
    
    // As listas são ordenadas de forma que para acessar um item de uma lista, use o operador de acesso indexado []
    val readOnlyShapes2 = listOf ("triângulo" , "quadrado" , "círculo")  
    println ( "O primeiro item da lista é: ${readOnlyShapes2[0]}" )
    // O primeiro item da lista é: triângulo

    // Para obter o primeiro ou o último item de uma lista, use as funções .first() e .last() respectivamente.
    val readOnlyShapes3 = listOf ("triângulo" , "quadrado" , "círculo")
    println(" O primeiro item da lista é: ${readOnlyShapes3.first()}" )
    // O primeiro item da lista é: triângulo

    println("Exemplo 3: ")
    println("")

    // Para obter o número  de itens em uma lista, use a função count()
    val readOnlyShapes4 = listOf("triângulo" , "quadrado" , "círculo")
    println ("Essa lista contém ${readOnlyShapes4.count()} itens")

    // Para verificar se um item está em uma lista use o operador in
    val readOnlyShapes5 = listOf("Triângulo" , "Quadrado" , "círculo")
    println ("círculo" in readOnlyShapes5)

    println("Exemplo 4: ")
    println("")

    val shapes1: MutableList<String> = mutableListOf("triangulo" , "quadrado" , "circulo")
    // adicionar "petágono" a lista
    shapes1.add("pentágono")
    println(shapes1)

    // remove "trinagulo" da lista
    shapes1.remove("triangulo")
    println(shapes1)

    println("Exemplo 5: ")
    println("")

    //Conjunto somente leitura
    val readOnlyFruit = setOf ("maçã", "kiwi" , "banana")
    // conjunto mutável com declaração de tipo explícita
    val fruit: MutableSet<String> = mutableSetOf("Maçã" , "Kiwi" , "Banana")

    println(readOnlyFruit)

    println("Exemplo 6: ")
    println("")

    val readOnlyFruit1 = setOf ("maçã", "kiwi" , "banana")
    println("Este conjunto tem ${readOnlyFruit1.count()} itens")
    // A 3 itens neste conjunto

    println("Exemplo 7: ")
    println("")

    val readOnlyFruit2 = setOf ("maçã", "kiwi" , "banana")
    println("banana" in readOnlyFruit2)
    // verdadeiro

    println("Exemplo 8: ")
    println("")

    val fruit1: MutableSet<String> = mutableSetOf("Maçã" , "Kiwi" , "Banana")
    fruit1.add("Uva")
    println(fruit1)

    fruit1.remove("Kiwi")
    println(fruit1)

    println("Exemplo 9: ")
    println("")

    val readOnlyJuiceMenu = mapOf ("maçã" to 100 , "kiwi" to 190 , "laranja" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu : MutableMap< String, Int > = mutableMapOf("maçã" to 100 , "kiwi" to 190 ,"laranja" to 100)
    println(juiceMenu)

    println("Exemplo 9: ")
    println("")

    val readOnlyJuiceMenu1 = mapOf("maçã" to 100 , "kiwi" to 190 , "laranja" to 100)
    println("O valor do suco de maçã é: ${readOnlyJuiceMenu1["maçã"]}")

     println("Exemplo 10: ")
    println("")

    val readOnlyJuiceMenu2 = mapOf("maçã" to 100 , "kiwi" to 190 , "laranja" to 100)
    println("Este mapa possui ${readOnlyJuiceMenu2.count()} pares")

    println("Exemplo 11: ")
    println("")

    val juiceMenu1: MutableMap<String,Int> = mutableMapOf("maçã" to 100 , "kiwi" to 190 , "laranja" to 100)
    juiceMenu1.put("coconut", 150)
    println(juiceMenu1)

    juiceMenu1.remove("kiwi")
    println(juiceMenu1)

    println("Exemplo 12: ")
    println("")

val readOnlyJuiceMenu3 = mapOf("maçã" to 100, "kiwi" to 190, "laranja" to 100)
println(readOnlyJuiceMenu3.containsKey("kiwi"))

println("Exemplo 13: ")
println("")

val readOnlyJuiceMenu4 = mapOf("maçã" to 100, "kiwi" to 190, "laranja" to 100)
println(readOnlyJuiceMenu4.keys)

println(readOnlyJuiceMenu4.values)

println("Exemplo 14: ")
println("")

val readOnlyJuiceMenu5 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("orange" in readOnlyJuiceMenu5.keys)

println(200 in readOnlyJuiceMenu5.values)
}

