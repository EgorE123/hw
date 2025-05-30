import java.util.Scanner;

public class Fibonacci {

    // Рекурсивный метод для вычисления числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число до которого хотите вывести ряд Фибоначчи: ");
        int limit = scanner.nextInt();

        System.out.println("Ряд Фибоначчи до " + limit + ":");
        int i = 0;
        while (true) {
            int fib = fibonacci(i);
            if (fib > limit) {
                break;
            }
            System.out.print(fib + " ");
            i++;
        }
    }
}