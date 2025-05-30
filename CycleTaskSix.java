// TODO Пропуск четных чисел
// Напишите программу, которая выводит все нечетные числа в диапазоне от 1 до 20.
// Программа должна использовать оператор continue, чтобы пропустить четные числа.
// Вывод чисел в строчку через пробел.
public class CycleTaskSix {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
