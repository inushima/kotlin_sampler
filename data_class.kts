// データクラス
data class Article(val url: String, val title: String, val view: Int = 0)

val article = Article("https://www.arcadit.co.jp/", "Kotlin TIPS", 12345)
println(article)

// componentNメソッド
val (url, title, view) = article
println(title)

// copy
val copied = article.copy(view = 1)
println(copied)