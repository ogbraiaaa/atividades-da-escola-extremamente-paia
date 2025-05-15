fun ehTriangular(num: Int): Boolean {
    if (num < 6) {
        return num == 1 || num == 3
    }
    var n = 1
    while (true) {
        val produto = n * (n + 1) * (n + 2)
        if (produto == num) {
            return true
        }
        if (produto > num) {
            return false
        }
        n++
    }
}

fun main() {
    val entrada = readlnOrNull()?.toIntOrNull()
    if (entrada != null) {
        if (ehTriangular(entrada)) {
            println("$entrada é triangular :)")
        } else {
            println("$entrada não é triangular :(")
        }
    } else {
        println("Isso é invalido")
    }
}