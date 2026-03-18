//•Crie uma classe chamada Pessoas
//Cada pessoa tem nome, idade, peso e altura
//Essa classe ter métodos para as seguintes tarefas:
//Mostrar nome
//Mostrar idade
//Mostrar peso
//Mostrar altura
//Calcular IMC (peso/(altura*altura))

class Pessoas(var Nome: String,
              var Idade: Int,
              var Peso : Double,
              var Altura : Double)
{
    fun Chamada (){
        val imc = Peso /(Altura*Altura)

        println("Meu nome é ${Nome}, Idade: ${Idade} Anos, Peso: ${Peso}kg, Altura: ${Altura}")
        println("Meu imc é: $imc")

        if (imc < 18.5){
            print("Abaixo do peso ideal!!")
        }
        else if (imc >= 18.5 && imc <= 24.9){
            println("Peso Normal")
            println("======================================================================================================")

        }
        else if (imc >= 25 && imc <= 29.9){
            println("Acima do Peso")
            println("======================================================================================================")
        }
        else if (imc >= 29.9 && imc <= 34.9){
            println("Obesidade nivel I")
            println("======================================================================================================")

        }
        else if (imc >= 34.9 && imc <= 39.9){
            println("Obesidade nivel II")
            println("======================================================================================================")
        }
        else if (imc >= 39.9){
            println("Obesidade nivel III")
            println("======================================================================================================")
        }

    }
}
//Faça uma função executável que:
//Instancie dois objetos pessoas
//Atribua a esses objetos nome, idade, peso e altura quaisquer
//Mostre o nome, idade, peso, altura e o IMC calculado dessas pessoas
//Baseando-se na tabela de IMC, escreva a situação da pessoa.

fun main()
{
    val p1 = Pessoas("Micael", Idade = 22, Peso = 88.0, Altura = 1.70)

    val p2 = Pessoas(Nome = "Ana", Idade = 20, Peso = 60.0, Altura = 1.65)
    p1.Chamada()
    p2.Chamada()
}

