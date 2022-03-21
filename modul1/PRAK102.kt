package praktikum1
import java.util.Scanner
fun matematika(): Int {
    val  input = Scanner(System.`in`)
    println("nilai x = ")
    val nilaix = input.nextInt()
    val fx = 2*(nilaix*nilaix) + 5*nilaix-8
    return fx
}
fun main(){
    println(matematika())
}