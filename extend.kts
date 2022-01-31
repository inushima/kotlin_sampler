// 継承
open class Person(var name: String = "名無権兵衛") {
    open fun show(): String {
        return "私は${this.name}です。"
    }
}

class BusinessPerson(name: String, var depart: String): Person(name) {
    override fun show(): String {
        return "${super.show()} 部署は${this.depart}です。"
    }

    fun work(): String {
        return "${super.name}はお仕事中です。"
    }
}

val b = BusinessPerson("山田太郎", "開発部")
println(b.show())

// スマートキャスト
val p: Person = BusinessPerson("山田二郎", "営業部")
if (p is BusinessPerson) {
    println(p.work())
}
