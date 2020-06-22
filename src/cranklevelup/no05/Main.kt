package cranklevelup.no05

fun main() {
    val pqr = readLine()!!.split(" ").map { it.toInt() }
    val pq = mutableMapOf<Int, Int>()
    repeat(pqr[0]) {
        val s = readLine()!!.split(" ").map { it.toInt() }
        pq[s[0]] = s[1]
    }
    val qr = mutableMapOf<Int, Int>()
    repeat(pqr[1]) {
        val s = readLine()!!.split(" ").map { it.toInt() }
        qr[s[0]] = s[1]
    }

    repeat(pqr[0]) {
        println("${it + 1} ${qr[pq[it + 1]!!]!!}")
    }
}
