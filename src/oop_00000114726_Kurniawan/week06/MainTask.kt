package oop_00000114726_Kurniawan.week06

fun main() {
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("--- Menjalankan Mode Keamanan ---")
    hub.activateSecurityMode()

    println("\n--- Mematikan Semua Perangkat ---")
    hub.turnOffAllSwitches()
}