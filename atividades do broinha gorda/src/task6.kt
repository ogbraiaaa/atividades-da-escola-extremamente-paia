fun main() {
    var array = IntArray(10)
    var contadorPares = 0

    println("Digite 10 números inteiros:")
    for (i in 0 until 10) {
        var entrada = readlnOrNull()?.toIntOrNull()
        if (entrada != null) {
            array[i] = entrada
        } else {
            println("Entrada inválida usando 0 para a posição $i.")
            array[i] = 0
        }
    }

    for (numero in array) {
        if (numero % 2 == 0) {
            contadorPares++
        }
    }

    println("Quantidade de números pares no array: $contadorPares")
}
