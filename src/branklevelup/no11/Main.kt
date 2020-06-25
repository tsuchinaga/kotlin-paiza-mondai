package branklevelup.no11

fun main() {
    val n = readLine()!!.toInt()
    val u = mutableListOf<String>()
    val ub = mutableMapOf<String, String>()
    repeat(n) {
        val s = readLine()!!.trim().split(" ")
        u.add(s[0])
        ub[s[0]] = s[1]
    }

    val m = readLine()!!.toInt()
    val br = mutableMapOf<String, String>()
    repeat(m) {
        val s = readLine()!!.trim().split(" ")
        br[s[0]] = s[1]
    }

    u.forEach { name -> println("%s %s".format(name, br[ub[name]])) }
}
