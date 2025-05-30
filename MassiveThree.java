import java.util.Arrays;
import java.util.Scanner;

// TODO Задача 3: Поиск заданного элемента в массиве
// Предоставлен массив чисел и значение,
// которое нужно найти. Ваша задача - определить, содержит ли массив заданное значение,
// и если да, то найти индекс этого значения в массиве.
public class MassiveThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Массив:" + Arrays.toString(mas));
        System.out.println("Введите значение:");
        int number = scanner.nextInt();
        for(int i=0; i<mas.length; i++) {
            if (mas[i] == number) {
                System.out.println(i);
            }
            }
        }
    }

