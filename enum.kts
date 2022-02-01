// enum
// TODO: kotlin scriptではエラーが発生

enum class Season(val value: Int) {
    SPRING(1) {
        override fun getDisplayName(): String = "春"
    },
    SUMMER(2) {
        override fun getDisplayName(): String = "夏"
    },
    AUTUMN(3) {
        override fun getDisplayName(): String = "秋"
    },
    WINTER(4) {
        override fun getDisplayName(): String = "冬"
    };

    // メソッド定義
    abstract fun getDisplayName(): String
}

val s = Season.SPRING
println(s)

println(s is Season)

// 値
println(s.value)
println(s.ordinal)

// valueOf
println("=== valueOf ===")
val winter = Season.valueOf("WINTER")
println(winter)

// values
println("=== values ===")
for (s in Season.values()) {
    // println("${s}: $${s.getDisplayName()}")
}
