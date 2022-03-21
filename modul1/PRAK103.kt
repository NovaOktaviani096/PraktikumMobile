package praktikum1
import java.util.Scanner
fun main(){
    val  input = Scanner(System.`in`)
    println("input bilangan : ")
    var bil = input.nextInt()
    var kelipatan = 1
    var hasil = 0
    while (kelipatan <= 5) {
        hasil += bil
        if (hasil % 2 == 0 || hasil % 3 == 0) {
            print("$hasil ")
            kelipatan++
        }
    }
}
