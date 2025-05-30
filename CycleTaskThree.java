import java.util.Scanner;

// TODO Пирамида из звездочек
//Напишите программу для создания пирамиды из звездочек с заданным количеством уровней.
// Используйте вложенные циклы for.
public class CycleTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество уровней пирамиды");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == number) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
