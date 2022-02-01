// extension
fun String.repeat(num: Int): String {
    var builder = StringBuilder()
    for (i in 1..num) {
        builder.append(this)
    }

    return builder.toString()
}

var str = "ほげ"
println(str.repeat(5))
