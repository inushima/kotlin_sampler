
// Generic inパラメーター
class ReverseComparator: Comparator<Any> {
    override fun compare(x: Any, y: Any): Int = -1
}

val list = listOf(108, 2, 35, 58)
println(list.sortedWith(ReverseComparator()))