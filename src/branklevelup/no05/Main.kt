package branklevelup.no05

fun main() {
    val c = readLine()!!
    val s = readLine()!!
    println(s.split("").map { if (it == c) 1 else 0 }.sum())
}
