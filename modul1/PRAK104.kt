package praktikum1
class JadwalOlahraga(){
    var jadwal = arrayOf("senin, 08.00","selasa, 10.30","rabu, 13.00")
}
fun main(){
    val waktu = JadwalOlahraga()
    println("jadwal main bulu tangkis ${waktu.jadwal[0]}")
    println("jadwal main sepak bola  ${waktu.jadwal[1]}")
    println("jadwal main tenis meja ${waktu.jadwal[2]}")
}