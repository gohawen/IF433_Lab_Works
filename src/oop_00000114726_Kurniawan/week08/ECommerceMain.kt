package oop_00000114726_Kurniawan.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                when(it) {
                    is Electronic -> println("Processing: ${it.name} (Warranty ${it.warrantyMonths})")
                    is Clothing -> println("Processing: ${it.name} (Size ${it.size})")
                }
                parser.checkout(it)
            } ?: println("Log: Skipping unknown product type.")

        } catch (e: IllegalArgumentException) {
            println("Log Peringatan: Data korup tertangkap - ${e.message}")
        }
    }
}

// final