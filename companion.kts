class Person private constructor(var name: String) {
    companion object Factory {
        fun getInstance(): Person {
            return Person("山田太郎")
        }
    }

    override fun toString(): String {
        return "Person: ${this.name}"
    }
}

val p = Person.getInstance()
println(p)