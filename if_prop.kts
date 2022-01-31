// インターフェースでプロパティ定義

import java.util.Date

interface Loggable {
    // プロパティ
    var header: String

    fun log(msg: Any) {
        // デフォルト実装からプロパティを参照可能
        println(" [${this.header}] ${msg.toString()}")
    }
}

open class MyClass(): Loggable {
    // インターフェースのプロパティ実装が必須
    override var header = "Parent Log"
}

val c = MyClass()
c.log(Date())
