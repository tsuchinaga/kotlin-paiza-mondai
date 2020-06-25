package branklevelup.no03

fun main() {
    val ab = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!
    println(s.substring(ab[0]-1, ab[1]))
}
