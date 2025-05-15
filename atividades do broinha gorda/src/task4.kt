fun isTriangular(numero: Int): Boolean {
    if (numero < 6) {
        return numero == 1 || numero == 3
    }
    var n = 1
    while (true) {
        val triangular = n * (n + 1) * (n + 2)
        if (triangular == numero) {
            return true
        }
        if (triangular > numero) {
            return false
        }
        n++
    }
}

fun main() {
    val numero = readlnOrNull()?.toIntOrNull()
    if (numero != null) {
        if (isTriangular(numero)) {
            println("$numero é um número triangular.")
        } else {
            println("$numero não é um número triangular.")
        }
    } else {
        println("entrada inválida.")
    }
}