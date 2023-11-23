class Store : Buyable {
    private val products = mutableMapOf(
        Pair(1, Product("Кола", 135)),
        Pair(2, Product("Фанта", 135)),
        Pair(3, Product("Колбаса", 270)),
        Pair(4, Product("хлеб", 60)),
        Pair(5, Product("Майонез", 265)),
    )

    fun store() {
        var productsSize = 1
        while (productsSize <= products.size) {
            println("$productsSize = ${products[productsSize]}")
            productsSize++
        }
    }

    override fun buy(id: Int, user: User) {
        var userBalance = user.balance
        when (id) {
            1 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            2 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            3 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            4 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            5 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            else -> {
                println("Вы ввели неверный id товара")
            }
        }
    }
}