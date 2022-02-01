// オブジェクト宣言

object MyApp {
    var name: String = "速習React"
    var author: String = "WINGS Project"

    fun dump() {
        println("${name}:${author}")
    }
}

MyApp.name = "速習Kotlin"
MyApp.dump()