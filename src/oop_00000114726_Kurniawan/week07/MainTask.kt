package oop_00000114726_Kurniawan.week07

fun main() {
    println("Drop chance item LEGENDARY adalah: ${ItemRarity.LEGENDARY.dropChance}")

    val playerWeapon = Weapon.forgeStarterSword()

    println("Detail Senjata Awal Pemain: $playerWeapon")
}