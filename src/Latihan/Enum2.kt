package Latihan

enum class Hari(val IsHariKerja: Boolean) {
    SENIN(true),
    SELASA(true),
    SABTU(false),
    MINGGU(false)
}

fun main() {
    val hariIni = Hari.SELASA
    if (hariIni.IsHariKerja) {
        println("Ayo kuliah/kerja!")
    } else {
        println("Waktunya istirahat!")
    }
}