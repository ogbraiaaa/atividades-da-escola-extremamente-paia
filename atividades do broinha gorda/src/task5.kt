fun main() {
    var array = IntArray(20) { 0 }
    for (i in array.indices) {
        println("Posição $i: ${array[i]}")
    }
}
