package cranklevelup.no02

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val s = readLine()!!.split(" ")
        val t = s[0].split(":")
        println(
            "%02d:%02d".format(
                (t[0].toInt() + s[1].toInt() + ((t[1].toInt() + s[2].toInt()) / 60)) % 24,
                (t[1].toInt() + s[2].toInt()) % 60
            )
        )
    }
}
