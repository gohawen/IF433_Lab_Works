package oop_00000114726_Kurniawan.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdekati: $it")
        it.length
    }
    println("Panjang nama: $length")
}