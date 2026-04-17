package Latihan

// PARENT (Abstract Class)
// Ingat: Abstract class tidak bisa dibuat objeknya langsung (val x = MahasiswaUMN() -> ERROR)
abstract class MahasiswaUMN(val nama: String) {

    // Concrete Method: Sudah ada isinya, otomatis diturunkan ke semua anak
    fun lokasiKampus() {
        println("Kampus: Universitas Multimedia Nusantara, Gading Serpong.")
    }

    // Abstract Method: Hanya "janji", WAJIB diisi (override) oleh anak
    abstract fun caraBelajar()
}

// CHILD 1: Mahasiswa Informatika
class MahasiswaInformatika(nama: String) : MahasiswaUMN(nama) {
    override fun caraBelajar() {
        println("$nama belajar menggunakan koding, algoritma, dan logika.")
    }
}

// CHILD 2: Mahasiswa Akuntansi (Tambahan agar terlihat perbedaannya)
class MahasiswaAkuntansi(nama: String) : MahasiswaUMN(nama) {
    override fun caraBelajar() {
        println("$nama belajar menggunakan laporan keuangan dan audit.")
    }
}

// --- FUNGSI UTAMA UNTUK DIJALANKAN ---
fun main() {
    // 1. Membuat objek dari class Child
    val mhs1 = MahasiswaInformatika("Awen")
    val mhs2 = MahasiswaAkuntansi("Budi")

    println("--- Info Mahasiswa 1 ---")
    mhs1.lokasiKampus() // Memanggil fungsi dari Parent
    mhs1.caraBelajar()  // Memanggil fungsi yang sudah di-override

    println("\n--- Info Mahasiswa 2 ---")
    mhs2.lokasiKampus()
    mhs2.caraBelajar()

    // 2. Contoh Polimorfisme (Sering keluar di UTS!)
    println("\n--- Simulasi Polimorfisme ---")
    val listMahasiswa: List<MahasiswaUMN> = listOf(mhs1, mhs2)

    for (mhs in listMahasiswa) {
        // Meskipun tipe datanya MahasiswaUMN, program tahu cara belajar masing-masing
        mhs.caraBelajar()
    }
}