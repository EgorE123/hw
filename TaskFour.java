import java.util.Scanner;

// TODO Напишите программу,
//  которая выводит таблицу умножения для числа,
//  введенного пользователем
public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите целое число");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + number + "=" + (i * number) + " ");
        }
    }
}
