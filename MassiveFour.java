// TODO Задача 4: Найти наименьший элемент в одномерном массиве чисел
import java.util.Arrays;
import java.util.Scanner;

public class MassiveFour {
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
        int minNumber = Arrays.stream(mas).min().getAsInt();
        System.out.println("Минимальное число: " + minNumber);
    }
}
