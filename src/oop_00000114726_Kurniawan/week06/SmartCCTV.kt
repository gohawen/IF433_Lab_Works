package oop_00000114726_Kurniawan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name non-aktif.")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam...")
    }
}