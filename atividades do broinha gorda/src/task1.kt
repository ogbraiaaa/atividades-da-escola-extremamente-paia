import kotlin.math.sqrt

fun calcularTempoAberturaSemaforo(distancia: Int, velocidade: Int, aceleracao: Int): Int {
    var tempoParaAtingirVelocidade = velocidade / aceleracao
    var distanciaAteVelocidade = (0.5 * aceleracao * tempoParaAtingirVelocidade * tempoParaAtingirVelocidade).toInt()

    var tempoParaPercorrerDistancia: Int

    if (distancia > distanciaAteVelocidade) {
        var distanciaRestante = distancia - distanciaAteVelocidade
        tempoParaPercorrerDistancia = tempoParaAtingirVelocidade + (distanciaRestante / velocidade)
    } else {
        var tempCalculo = (2.0 * distancia) / aceleracao
        tempoParaPercorrerDistancia = sqrt(tempCalculo).toInt()
    }

    return tempoParaPercorrerDistancia + 3
}

fun main() {
    var distancia = 100
    var velocidade = 20
    var aceleracao = 2
    var tempoAbertura = calcularTempoAberturaSemaforo(distancia, velocidade, aceleracao)
    println("o semaforo deve abrir $tempoAbertura segundos antes")
}
