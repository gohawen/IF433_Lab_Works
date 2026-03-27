package oop_00000114726_Kurniawan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur KW", 99, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }

    override fun toString(): String {
        return "Weapon(Nama='${item.name}', Damage=${item.damage}, Rarity=${item.rarity}, Durability=$durability)"
    }
}