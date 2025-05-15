fun main() {
    val idadeMaxima = 30
    val idadeMinima = 18
    val matriz = Array(idadeMaxima - idadeMinima + 1) { IntArray(idadeMaxima - idadeMinima + 1) }

    while (true) {
        println("Informe a idade do homem (18 a 30) ou um valor inválido para sair:")
        val idadeHomem = readLine()?.toIntOrNull() ?: break
        if (idadeHomem < idadeMinima || idadeHomem > idadeMaxima) break

        println("Informe a idade da mulher (18 a 30) ou um valor inválido para sair:")
        val idadeMulher = readLine()?.toIntOrNull() ?: break
        if (idadeMulher < idadeMinima || idadeMulher > idadeMaxima) break

        matriz[idadeHomem - idadeMinima][idadeMulher - idadeMinima]++
    }

    val idadeMaisFrequenteHomem = matriz.indices.maxByOrNull { matriz[it].sum() }?.plus(idadeMinima) ?: -1
    val idadeMaisFrequenteMulher = matriz[0].indices.maxByOrNull { col -> matriz.sumOf { it[col] } }?.plus(idadeMinima) ?: -1
    var maxFrequencia = 0
    var combinacaoMaisFrequente = Pair(-1, -1)

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            if (matriz[i][j] > maxFrequencia) {
                maxFrequencia = matriz[i][j]
                combinacaoMaisFrequente = Pair(i + idadeMinima, j + idadeMinima)
            }
        }
    }

    println("Idade mais frequente de casamento dos homens: $idadeMaisFrequenteHomem")
    println("Idade mais frequente de casamento das mulheres: $idadeMaisFrequenteMulher")
    println("Combinação mais frequente de idades de casamento: ${combinacaoMaisFrequente.first} e ${combinacaoMaisFrequente.second}")
}
