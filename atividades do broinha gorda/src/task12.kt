import kotlin.math.abs

fun main() {
    println("Digite a posição da dama (ex: a1):")
    var damaPosStr = readlnOrNull() ?: ""
    println("Digite a posição de destino (ex: h8):")
    var destinoPosStr = readlnOrNull() ?: ""

    var damaCol = damaPosStr[0].lowercaseChar().toInt() - 'a'.toInt()
    var damaLin = damaPosStr.substring(1).toIntOrNull() ?: -1
    var destinoCol = destinoPosStr[0].lowercaseChar().toInt() - 'a'.toInt()
    var destinoLin = destinoPosStr.substring(1).toIntOrNull() ?: -1

    if (damaCol in 0..7 && damaLin in 1..8 && destinoCol in 0..7 && destinoLin in 1..8) {
        var damaLinIndex = damaLin - 1
        var destinoLinIndex = destinoLin - 1

        if (damaCol == destinoCol || damaLinIndex == destinoLinIndex || abs(damaCol - destinoCol) == abs(damaLinIndex - destinoLinIndex)) {
            println("Mínimo de movimentos: 1")
        } else {
            println("Mínimo de movimentos: 2")
        }
    } else {
        println("Posição inválida.")
    }
}
