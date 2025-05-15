import kotlin.math.abs

fun main() {
    println("Digite a posição da dama (ex: a1):")
    val damaPosStr = readlnOrNull() ?: ""
    println("Digite a posição de destino (ex: h8):")
    val destinoPosStr = readlnOrNull() ?: ""

    val damaCol = damaPosStr[0].lowercaseChar() - 'a'
    val damaLin = damaPosStr.substring(1).toIntOrNull() ?: -1
    val destinoCol = destinoPosStr[0].lowercaseChar() - 'a'
    val destinoLin = destinoPosStr.substring(1).toIntOrNull() ?: -1

    if (damaCol in 0..7 && damaLin in 1..8 && destinoCol in 0..7 && destinoLin in 1..8) {
        val damaLinIndex = damaLin - 1
        val destinoLinIndex = destinoLin - 1

        if (damaCol == destinoCol || damaLinIndex == destinoLinIndex || abs(damaCol - destinoCol) == abs(damaLinIndex - destinoLinIndex)) {
            println("Mínimo de movimentos: 1")
        } else {
            println("Mínimo de movimentos: 2")
        }
    } else {
        println("Posição inválida.")
    }
}