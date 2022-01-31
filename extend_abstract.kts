// 抽象クラス
abstract class Figure(var width: Double, var height: Double) {
    abstract fun getArea(): Double
}

class Triangle(width: Double, height: Double): Figure(width, height) {
    override fun getArea(): Double {
        return this.width * this.height / 2
    }
}

val t = Triangle(5.0, 4.0)
t.getArea()