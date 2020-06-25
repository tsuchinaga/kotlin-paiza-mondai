package branklevelup.no07

fun main() {
    val n = readLine()!!.toInt()
    val m = mutableMapOf<Int, String>()
    repeat(n) {
        val s = readLine()!!.split(" ")
        m[s[1].toInt()] = s[0]
    }
    m.toSortedMap().forEach { (_, u) -> println(u) }
}
