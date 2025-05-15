fun main() {
    println("Digite um número inteiro menor que 32:")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0

    if (numero in 0..31) {
        val binario = numero.toString(2)
        println("O número $numero em binário é: $binario")
    } else {
        println("Número inválido.")
    }
}