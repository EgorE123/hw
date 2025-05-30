import java.util.Arrays;
import java.util.Scanner;

// TODO Задача 2: Проверка на анаграммы (boolean)

//Условие: Напишите метод для проверки areAnagrams, принимающего 2 строки,
// являются ли они анаграммами (имеют одни и те же символы в разном порядке).
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1");
        String lineOne = scanner.nextLine();
        System.out.println("Введите строку 2");
        String lineTwo = scanner.nextLine();

            char[] charsOne = lineOne.toLowerCase().toCharArray();
            char[] charsTwo = lineTwo.toLowerCase().toCharArray();
            Arrays.sort(charsOne);
            Arrays.sort(charsTwo);
            boolean areAnagrams = Arrays.equals(charsOne, charsTwo);
            System.out.println(areAnagrams);
        }
    }



