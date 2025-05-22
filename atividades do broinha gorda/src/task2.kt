fun fibonacci(n: Int): List<Int> {
    var lista = mutableListOf<Int>()
    if (n >= 1) lista.add(1)
    if (n >= 2) lista.add(1)
    for (i in 2 until n) {
        var proximo = lista[i - 1] + lista[i - 2]
        lista.add(proximo)
    }
    return lista
}

fun main() {
    var n = readlnOrNull()?.toIntOrNull()
    if (n != null && n > 0) {
        var resultado = fibonacci(n)
        println(resultado.joinToString(", "))
    }
}
