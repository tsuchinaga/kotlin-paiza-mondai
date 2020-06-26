package warset.no09

fun main() {
    val dots = mutableListOf<List<Int>>()
    val nm = readLine()!!.split(" ").map { it.toInt() }
    repeat(nm[0]) {
        dots.add(readLine()!!.split("").filter { it != "" }.map { c ->
            when (c) {
                "#" -> 1
                else -> 0
            }
        })
    }

    val ans = mutableListOf<String>()
    if (vertical(nm[0], nm[1], dots) || horizontal(nm[0], nm[1], dots)) ans.add("line")
    if (point(nm[0], nm[1], dots)) ans.add("point")
    if (ans.size > 0) println("%s symmetry".format(ans.joinToString(" ")))
    else println("none")
}

fun vertical(n: Int, m: Int, dots: List<List<Int>>): Boolean {
    repeat(n / 2) { l ->
        repeat(m) { k ->
            if (dots[l][k] != dots[n - l - 1][k]) return false
        }
    }
    return true
}

fun horizontal(n: Int, m: Int, dots: List<List<Int>>): Boolean {
    repeat(n) { l ->
        repeat(m / 2) { k ->
            if (dots[l][k] != dots[l][m - k - 1]) return false
        }
    }
    return true
}

fun point(n: Int, m: Int, dots: List<List<Int>>): Boolean {
    repeat(n) { l ->
        repeat(m) { k ->
            if (dots[l][k] != dots[n - l - 1][m - k - 1]) return false
        }
    }
    return true
}
