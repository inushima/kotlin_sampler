// ジェネリック関数
fun <T> tail(list: Array<T>): T = list[list.size - 1]

val data = arrayOf(1, 2, 3, 5)

println(tail(data))
