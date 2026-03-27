package oop_00000114726_Kurniawan.week07

fun main() {
    val playerWeapon = Weapon.forgeStarterSword()

    val upgradedGameItem = playerWeapon.item.copy(damage = 25)

    processEvent(SafeZone)

    processEvent(MonsterEncounter("Goblin Nakal"))

    processEvent(LootDropped(upgradedGameItem))

    processEvent(GameOver("Terkena jebakan racun"))
}