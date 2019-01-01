/**
 * Kotlin で Java クラスを利用する。
 */
fun main(args: Array<String>) {
    val person = Person()
    // Person クラスの setter に対応
    person.name = "Yamada"

    // Person クラスの getter に対応
    println(person.name)
    println(person.nameLength)
}
