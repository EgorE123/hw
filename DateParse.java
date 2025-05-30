//TODO Напишите программу,
// которая запрашивает у пользователя ввод даты в формате "год-месяц-день"
// (например, "2022-01-31").
// Затем попробуйте преобразовать эту строку в объект типа LocalDate с помощью метода LocalDate.parse().
// Обработайте возможное исключение DateTimeParseException, если введенная строка имеет неверный формат.

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;
        boolean trueDate = false;

        while (!trueDate) {
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2022-01-31): ");
            String input = scanner.nextLine();

            try {
                date = LocalDate.parse(input);
                trueDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Ошибка: неверный формат даты. Попробуйте снова.");
            }
        }
        System.out.println("Вы ввели дату: " + date);
        scanner.close();
    }
}

