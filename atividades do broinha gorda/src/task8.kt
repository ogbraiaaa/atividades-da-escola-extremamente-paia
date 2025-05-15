fun main() {
    println("Digite uma string:")
    val texto = readlnOrNull() ?: ""
    var contador = 0
    val vogais = "aeiouAEIOU"
    for (char in texto) {
        if (vogais.contains(char)) {
            contador++
        }
    }
    println("Número de vogais: $contador")
}