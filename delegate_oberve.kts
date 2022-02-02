import kotlin.properties.Delegates

// 移譲プロパティ
class Person() {
    var name: String by Delegates.observable("??????") {
        prop, prev, next ->
            println("${prop.name}プロパティ : ${prev}-> ${next}")
    }
}

val p = Person()
p.name = "佐藤敏夫"
p.name = "鈴木幸作"
