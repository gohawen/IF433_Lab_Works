package oop_00000114726_Kurniawan.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}