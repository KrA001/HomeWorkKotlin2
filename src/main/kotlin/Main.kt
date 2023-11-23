import java.util.*

fun main(args: Array<String>) {
    val store = Store()
    with(store) {
        val user = User("Гари", "Алея 15").apply {
            balance = 10000
        }
        val scanner = Scanner(System.`in`)
        store()
        println("----------------------------------------")
        print("Введите индекс товара: ")
        buy(scanner.nextInt(), user)
    }
}