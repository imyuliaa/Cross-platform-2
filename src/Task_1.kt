import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введіть три цілі числа:")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    var count = 0

    if (isTwoDigit(num1)) {
        count++
    }
    if (isTwoDigit(num2)) {
        count++
    }
    if (isTwoDigit(num3)) {
        count++
    }

    println("Кількість двоцифрових чисел: $count")
}

fun isTwoDigit(num: Int): Boolean {
    // Перевіряємо, чи число знаходиться в інтервалі [-99, -10] або [10, 99]
    return (num >= -99 && num <= -10) || (num >= 10 && num <= 99)
}
