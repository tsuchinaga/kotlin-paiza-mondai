package cranklevelup.no04

fun main() {
    val n = readLine()!!.toInt()
    val owned = mutableListOf<String>()
    repeat(n) {
        val gs = readLine()!!.split(" ").map { it.toInt() }
        owned.add("%02d:%02d".format(gs[1], gs[0]))
    }
    owned.sortDescending()
    owned.forEach {
        val v = it.split(":").map { n -> n.toInt() }
        println("${v[1]} ${v[0]}")
    }
}
