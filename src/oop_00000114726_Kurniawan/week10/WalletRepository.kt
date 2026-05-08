package oop_00000114726_Kurniawan.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(searchName: String): T? {
        return items.find { it is NamedEntity && it.name == searchName }
    }
}