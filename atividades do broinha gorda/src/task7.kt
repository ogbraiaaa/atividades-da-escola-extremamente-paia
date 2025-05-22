fun main() {
    var junho = IntArray(30) { 0 }
    println("Digite o índice pluviométrico de cada dia de junho:")
    for (i in 0 until 30) {
        var leitura = readlnOrNull()?.toIntOrNull()
        junho[i] = leitura ?: 0
    }

    var maxChuva = junho[0]
    var diaMax = 1
    var minChuva = junho[0]
    var diaMin = 1
    var somaPrimeiraQuinzena = 0
    var somaSegundaQuinzena = 0

    for (i in 0 until 15) {
        somaPrimeiraQuinzena += junho[i]
        if (junho[i] > maxChuva) {
            maxChuva = junho[i]
            diaMax = i + 1
        }
        if (junho[i] < minChuva) {
            minChuva = junho[i]
            diaMin = i + 1
        }
    }

    for (i in 15 until 30) {
        somaSegundaQuinzena += junho[i]
        if (junho[i] > maxChuva) {
            maxChuva = junho[i]
            diaMax = i + 1
        }
        if (junho[i] < minChuva) {
            minChuva = junho[i]
            diaMin = i + 1
        }
    }

    var mediaPrimeiraQuinzena = (somaPrimeiraQuinzena.toDouble() / 15).toInt()
    var mediaSegundaQuinzena = (somaSegundaQuinzena.toDouble() / 15).toInt()

    println("Dia com mais chuva: $diaMax ($maxChuva)")
    println("Dia com menos chuva: $diaMin ($minChuva)")
    println("Média da primeira quinzena: $mediaPrimeiraQuinzena")
    println("Média da segunda quinzena: $mediaSegundaQuinzena")
}
