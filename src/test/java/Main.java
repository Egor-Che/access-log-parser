import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + quotient);
        int sum = firstNumber + secondNumber;
        System.out.println("Сумма: " + sum);
        int raznost = firstNumber - secondNumber;
        System.out.println("Разность: " + raznost);
        int proizvedenie = firstNumber * secondNumber;
        System.out.println("Произведение: " + proizvedenie);
    }
}
