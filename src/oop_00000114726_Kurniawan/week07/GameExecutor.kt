package oop_00000114726_Kurniawan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Awas! Kamu bertemu monster: ${event.monsterName}")
        }
        is LootDropped -> {
            println("Mendapat loot! Item: ${event.item.name} [Rarity: ${event.item.rarity}]")
        }
        is GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }
        is SafeZone -> {
            println("Kamu memasuki Safe Zone. Area ini aman!")
        }
    }
}