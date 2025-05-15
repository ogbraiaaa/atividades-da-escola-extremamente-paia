import kotlin.math.sqrt

fun calcularTempoAberturaSemaforo(distancia: Double, velocidade: Double, aceleracao: Double): Double {
    val tempoParaAtingirVelocidade = velocidade / aceleracao
    val distanciaAteVelocidade = 0.5 * aceleracao * tempoParaAtingirVelocidade * tempoParaAtingirVelocidade
    val tempoParaPercorrerDistancia = if (distancia > distanciaAteVelocidade) {
        val distanciaRestante = distancia - distanciaAteVelocidade
        tempoParaAtingirVelocidade + (distanciaRestante / velocidade)
    } else {
        val tempoParaParar = sqrt((2 * distancia) / aceleracao)
        tempoParaParar
    }
    return tempoParaPercorrerDistancia + 3
}

fun main() {
    val distancia = 100.0
    val velocidade = 20.0
    val aceleracao = 2.0
    val tempoAbertura = calcularTempoAberturaSemaforo(distancia, velocidade, aceleracao)
    println("o semaforo deve abrir $tempoAbertura segundos antes")
}
