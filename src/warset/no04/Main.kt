package warset.no04

fun main() {
    repeat(readLine()!!.toInt()) {
        when (readLine()!!) {
            "forward" -> println("Sunny")
            "reverse" -> println("Rainy")
            "sideways" -> println("Cloudy")
        }
    }
}
