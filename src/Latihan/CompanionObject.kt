package Latihan

class Mhs(val nama: String) {

    // Ini adalah Companion Object (Nempel di class Mahasiswa)
    companion object {
        val UNIVERSITAS = "Universitas Multimedia Nusantara"
        var jumlahMahasiswa = 0

        fun tampilkanTotal() {
            println("Total Mahasiswa di $UNIVERSITAS: $jumlahMahasiswa")
        }
    }

    // Blok init jalan setiap kali kita buat objek baru
    init {
        jumlahMahasiswa++
    }
}

fun main() {
    // 1. Akses konstanta tanpa buat objek
    println("Selamat datang di ${Mhs.UNIVERSITAS}")

    // 2. Buat beberapa objek Mhs
    val mhs1 = Mhs("Awen")
    val mhs2 = Mhs("Budi")
    val mhs3 = Mhs("Cici")

    // 3. Panggil fungsi di dalam companion object
    Mhs.tampilkanTotal()
}