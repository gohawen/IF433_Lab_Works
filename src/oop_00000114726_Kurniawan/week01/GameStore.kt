package oop_00000114726_Kurniawan.week01

// Fungsi logika diskon
fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        (price * 20) / 100
    else
        (price * 10) / 100

fun main() {
    // Persiapan data awal
    val gameTitle: String = "Minecraft"
    val price: Int = 500000

    println("Game Title : $gameTitle")
    println("Price      : Rp $price")
}