// 遅延プロパティ
class MyClass() {
    val randomValue: Double by lazy {
        println("initialized...")
        Math.random()
    }
}

val c = MyClass()
println(c.randomValue)
println(c.randomValue)