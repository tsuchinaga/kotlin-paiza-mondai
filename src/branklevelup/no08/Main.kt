package branklevelup.no08

fun main() {
    val n = readLine()!!.toInt()
    val m = mutableMapOf<String, Int>()
    repeat(n) {
        val s = readLine()!!.split(" ")
        m[s[0]]?.let { m[s[0]] = it + s[1].toInt() } ?: run { m[s[0]] = s[1].toInt() }
    }

    while (m.isNotEmpty()) {
        var maxI = ""
        var max = 0
        m.forEach { (k, v) ->
            if (maxI == "" || max < v) {
                maxI = k
                max = v
            }
        }
        println("%s %d".format(maxI, max))
        m.remove(maxI)
    }
}
