// ジェネリック

class MyGenerics<T>(var value: T) {
    fun getProp(): T {
        return this.value
    }
}

val g = MyGenerics<String>("Hoge")
println(g.getProp())
