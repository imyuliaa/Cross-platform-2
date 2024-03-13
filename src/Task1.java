import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три цілі числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int count = 0;

        if (isTwoDigit(num1)) {
            count++;
        }
        if (isTwoDigit(num2)) {
            count++;
        }
        if (isTwoDigit(num3)) {
            count++;
        }

        System.out.println("Кількість двоцифрових чисел: " + count);
    }

    public static boolean isTwoDigit(int num) {
        // Перевіряємо, чи число знаходиться в інтервалі [-99, -10] або [10, 99]
        return (num >= -99 && num <= -10) || (num >= 10 && num <= 99);
    }
}
