import java.util.Scanner;

// TODO Напишите программу,
//  которая проверяет, является ли число,
//  введенное пользователем, простым.
public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите целое число");
        int temp;
        boolean isPrime = true;
        int num = scanner.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " простое");
        } else {
            System.out.println(num + " составное");
        }


    }
}


