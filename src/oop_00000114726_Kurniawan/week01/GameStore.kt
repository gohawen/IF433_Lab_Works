package oop_00000114726_Kurniawan.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        (price * 20) / 100
    else
        (price * 10) / 100

fun printReceipt(
    title: String,
    finalPrice: Int,
    userNote: String?
) {
    println("===== STRUK PEMBELIAN =====")
    println("Game Title  : $title")
    println("Harga Akhir : Rp $finalPrice")

    println("Catatan     : ${userNote ?: "Tidak ada catatan"}")

    println("============================")
}

fun main() {
    // Persiapan data awal
    val gameTitle: String = "Minecraft"
    val price: Int = 500000

    val userNote: String? = null

    // hitung diskon
    val discount = calculateDiscount(price)

    // harga akhir
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}
