fun main() {
    println("Digite a quantidade de números:")
    var n = readlnOrNull()?.toIntOrNull() ?: 0
    var numeros = IntArray(n)

    println("Digite os $n números:")
    for (i in 0 until n) {
        numeros[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }

    for (i in numeros.indices.reversed()) {
        println(numeros[i])
    }
}
