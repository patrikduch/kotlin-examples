fun main() {

    val dict = mutableMapOf<Int, Boolean>()

    dict[1] = true

    dict.forEach {
        println(it)
    }
}