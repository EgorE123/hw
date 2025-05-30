//TODOНапишите программу, которая запрашивает у пользователя ввод данных и
// пытается обработать этот ввод. Обработайте исключение InputMismatchException,
// которое возникает, если введенные данные не соответствуют ожидаемому формату.

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean trueInput = false;

        while (!trueInput) {
            try {
                System.out.print("Введите целое число: ");
                number = scanner.nextInt();
                trueInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }

        System.out.println("Вы ввели число: " + number);
        scanner.close();
    }
}

