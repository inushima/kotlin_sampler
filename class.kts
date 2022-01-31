// オブジェクト指向のサンプル

import java.lang.IllegalArgumentException

class Person(name: String, age: Int) {
    // 定数
    val race = "人間"
    val isAdult
        get() = age >= 20

    var name = "名無権兵衛"
        private set

    var age = 10
        // アクセサー
        set(value) {
            if ( value <= 0) {
                throw IllegalArgumentException("ageは正数で指定してください")
            }

            field = value
        }

    init {
        this.name = name
        this.age = age
    }

    constructor(name: String) :this(name, 16)

    constructor() :this("名無権兵衛")

    fun show() {
        println("私は${name}です。年齢は${age}才です。")
    }
}

val p1 = Person("山田太郎", 18)
p1.show()
p1.isAdult

val p2 = Person("近藤三郎")
p2.show()


val p3 = Person()
p3.show()
