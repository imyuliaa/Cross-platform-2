import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення коефіцієнтів a, b та c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b*b-4*c;

        if(d<0) {
            System.out.printf("Розв'язків немає");
            return;
        }
        double x1 = (-b - Math.sqrt(d))/2;
        double x2 = (-b + Math.sqrt(d))/2;

        if (-a<x1){
            System.out.printf("x [%f; %f]", x1,x2);
        }
        else if(-a==x1){
            System.out.printf("x (%f; %f]", x1,x2);
        }
        else if(-a>x2 || -a==x2){
            System.out.printf("Розв'язків немає");
        }
        else{
            System.out.printf("x (%f; %f]", -a,x2);
        }

    }
}
