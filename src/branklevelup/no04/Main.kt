package branklevelup.no04

fun main() {
    val ab = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    println(s.substring(0, ab[0]-1) + s.substring(ab[0] - 1, ab[1]).toUpperCase() + s.substring(ab[1]))
}
