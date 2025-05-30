import java.util.Scanner;

public class PiraMida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Шаг 1: получаем количество строк для пирамиды
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Шаг 2: проходим по каждой строке
        for (int i = 1; i <= rows; i++) {

            // Шаг 3: выводим пробелы для правильного выравнивания
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Шаг 4: выводим звёзды и пустые пробелы
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*"); // Выводим звезду на границе или в последней строке
                } else {
                    System.out.print("*"); // Выводим пробел для пустой части
                }
            }

            // Переходим на следующую строку после вывода каждой строки
            System.out.println();
        }

        // Закрываем сканер
        scanner.close();
    }
}
// пошаманить с условием