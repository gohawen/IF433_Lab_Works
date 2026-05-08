package oop_00000114726_Kurniawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 2.5))
    coinRepo.add(Coin("ETH", 14.2))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    response.data.forEach { coin ->
        println("- Koin: ${coin.name} | Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 0.05))
    txRepo.add(Transaction("TX-002", 1.20))

    // TEST
}