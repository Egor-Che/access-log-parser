import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        double result4 = (double) number1 / number2;

        System.out.println("Сумма введенных чисел равна: " + result1);
        System.out.println("Разность введенных чисел равна: " + result2);
        System.out.println("Произведение введенных чисел равно: " + result3);
        System.out.println("Частное введенных чисел равно: " + result4);

    }
}
