package oop_00000114726_Kurniawan.week03

fun main() {

    val player = Player("Aris")

    println(player.xp) // ini akan error

    player.addXp(50) // lvl 1

    player.addXp(60) // lvl 2
}