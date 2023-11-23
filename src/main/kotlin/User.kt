data class User(
    val name: String,
    val address: String,
) {
    var balance: Int = 0
        set(value) {
            if (value > 0 && value < 100000) {
                field = value
            } else {
                throw IllegalArgumentException("За раз можно пополнить баланас только на сумму не выше 100 000")
            }
        }
}
