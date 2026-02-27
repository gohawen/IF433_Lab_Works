package oop_00000114726_Kurniawan.week04

fun main() {
    println("=== Pengujian Hierarki Karyawan ===")

    val headManager = Manager("Budi", 8000000)
    headManager.work()
    println("Bonus ${headManager.name}: Rp ${headManager.calculateBonus()}")

    println()

    val leadDev = Developer("Siti", 7000000, "Kotlin")
    leadDev.work()
    println("Bonus ${leadDev.name}: Rp ${leadDev.calculateBonus()}")
}