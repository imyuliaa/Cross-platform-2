import java.util.*
import kotlin.math.sqrt

object Task_2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        println("Введіть значення коефіцієнтів a, b та c:")
        val a = scanner.nextDouble()
        val b = scanner.nextDouble()
        val c = scanner.nextDouble()
        val d = b * b - 4 * c

        if (d < 0) {
            System.out.printf("Розв'язків немає")
            return
        }
        val x1 = (-b - sqrt(d)) / 2
        val x2 = (-b + sqrt(d)) / 2

        if (-a < x1) {
            System.out.printf("x [%f; %f]", x1, x2)
        } else if (-a == x1) {
            System.out.printf("x (%f; %f]", x1, x2)
        } else if (-a > x2 || -a == x2) {
            System.out.printf("Розв'язків немає")
        } else {
            System.out.printf("x (%f; %f]", -a, x2)
        }
    }
}