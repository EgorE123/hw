import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел (exit для завершения):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numberList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число или 'exit' для выхода.");
            }
        }

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить число.");
            System.out.println("2. Удалить число.");
            System.out.println("3. Содержимое списка.");
            System.out.println("4. Количество элементов.");
            System.out.println("5. Замена элемента.");
            System.out.println("6. Есть ли элемент в списке");
            System.out.println("7. Выход.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Добавить число: ");
                    int numberToAdd = scanner.nextInt();
                    numberList.add(numberToAdd);
                    break;

                case 2:
                    System.out.print("Удалить число: ");
                    int remove = scanner.nextInt();
                    if (numberList.remove((Integer) remove)) {
                        System.out.println("Число " + remove + " удалено.");
                    } else {
                        System.out.println("Число " + remove + " не найдено в списке.");
                    }
                    break;

                case 3:
                    System.out.println("Список: " + numberList);
                    break;

                case 4:
                    System.out.println("Количество элементов: " + numberList.size());

                    break;
                case 5:
                    System.out.print("Введите индекс элемента для замены: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < numberList.size()) {
                        System.out.print("Введите новое значение: ");
                        int newValue = scanner.nextInt();
                        numberList.set(index, newValue);
                    } else {
                        System.out.println("Ошибка.");
                    }
                    break;

                case 6:
                    System.out.print("Введите значение для проверки: ");
                    int value = scanner.nextInt();
                    if (numberList.contains(value)) {
                        System.out.println("Значение " + value + " найдено в списке.");
                    } else {
                        System.out.println("Значение " + value + " не найдено в списке.");
                    }
                    break;

                case 7:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ошибка");
                    break;
            }
        }
    }
}