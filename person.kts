// オブジェクト指向のサンプル

import java.lang.IllegalArgumentException

class Person {
    // 定数
    val race = "人間"
    val isAdult
        get() = age >= 20

    var name = "名無権兵衛"
    var age = 10
        // アクセサー
        set(value) {
            if ( value <= 0) {
                throw IllegalArgumentException("ageは正数で指定してください")
            }

            field = value
        }

    fun show() {
        println("私は${name}です。年齢は${age}才です。")
    }
}

val p = Person()
p.show()
p.isAdult
