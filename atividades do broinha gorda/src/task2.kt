fun fibonacci(n: Int): List<Int> {
    val lista = mutableListOf<Int>()
    if (n >= 1) lista.add(1)
    if (n >= 2) lista.add(1)
    for (i in 2 until n) {
        val proximo = lista[i - 1] + lista[i - 2]
        lista.add(proximo)
    }
    return lista
}

fun main() {
    val n = readlnOrNull()?.toIntOrNull()
    if (n != null && n > 0) {
        val resultado = fibonacci(n)
        println(resultado.joinToString(", "))
    }
}