package oop_00000114726_Kurniawan.week05

fun main() {
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}