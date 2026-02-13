package oop_00000114726_Kurniawan.week02

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = input.nextLine()
    print("Masukkan Base Damage: ")
    val damage = input.nextInt()

    val player = Hero(heroName, damage)

    var enemyHp = 100
    val enemyName = "Orc"

    println("\n=== PERTANDINGAN DIMULAI ===")
    println("${player.name} VS $enemyName")

    while (player.isAlive() && enemyHp > 0) {
        println("\n--- Menu ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        when (input.nextInt()) {
            1 -> {
                player.attack(enemyName)
                enemyHp -= player.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP $enemyName sisa: $enemyHp")

                if (enemyHp > 0) {
                    val monsterDamage = (10..20).random()
                    player.takeDamage(monsterDamage)
                    println("$enemyName membalas! Kamu terkena $monsterDamage damage.")
                    println("HP kamu sisa: ${player.hp}")
                }
            }
            2 -> {
                println("Kamu memilih kabur... Game Over!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL AKHIR ===")
    if (player.hp > enemyHp) {
        println("Selamat! ${player.name} Menang!")
    } else if (enemyHp > player.hp) {
        println("Yah... $enemyName Menang. Coba lagi!")
    } else {
        println("Pertarungan Seri!")
    }
}