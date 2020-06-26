package warset.no06

fun main() {
    val s = readLine()!!.split(" ").map { it.substring(0, 1) }
    println("%s.%s.".format(s[0], s[1]))
}
