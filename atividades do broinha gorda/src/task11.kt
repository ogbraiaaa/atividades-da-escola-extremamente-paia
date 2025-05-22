fun main() {
    println("Digite um número inteiro menor que 32:")
    var numero = readlnOrNull()?.toIntOrNull() ?: 0

    if (numero in 0..31) {
        var binario = numero.toString(2)
        println("O número $numero em binário é: $binario")
    } else {
        println("Número inválido.")
    }
}
