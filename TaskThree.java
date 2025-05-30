import java.util.Scanner;

// TODO Напишите программу,
//  которая вычисляет факториал числа,
//  введенного пользователем
public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите целое число");
        int number = scanner.nextInt();
        int factorial = 1;
        if (number < 0) {
            System.out.println("Введите положительное число");
            return;
        }
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал равен " + factorial);
    }
}
