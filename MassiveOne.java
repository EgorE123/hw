// TODO Задача 1: Переворот массива:
//Напишите программу, которая переворачивает массив,
// так чтобы последний элемент стал первым, предпоследний - вторым и так далее.
// Используйте Random для заполнения массива. Вывести свои было и стало.
//Пример было:
//[5, 4, 3, 2, 1]
//Стало:
//[1, 2, 3, 4, 5]

import java.util.Random;
public class MassiveOne {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //  5 - это колличество элементов в массиве
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println("Массив перед реверсом:");

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[5 - 1 - i] = temp;
        }
        System.out.println(" \n Массив после реверса:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
