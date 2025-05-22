fun main() {
    println("Digite uma string:")
    var texto = readlnOrNull() ?: ""
    var contador = 0
    var vogais = "aeiouAEIOU"
    for (char in texto) {
        if (vogais.contains(char)) {
            contador++
        }
    }
    println("Número de vogais: $contador")
}
