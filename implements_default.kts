// インターフェースのデフォルト実装

interface Runnable {
    fun run() {
        println("Starting...run!")
    }
}

class Fax(): Runnable {
    fun send() {
        println("Sending fax...done!")
    }
}

val f = Fax()
f.run()
f.send()
