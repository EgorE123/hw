// TODO Задача 2: Поиск дубликатов в массиве:
//  Вам предоставляется массив элементов, и ваша задача - определить,
//  есть ли дубликаты (повторяющиеся элементы) в массиве.Если есть,
//  выведите информацию о том, какие элементы являются дубликатами и их индексы.

import java.util.Arrays;
import java.util.Scanner;

public class MassiveTwo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        System.out.println("Введите элементы массива:");

        for(int i=0; i<size; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println("Массив:"+Arrays.toString(mas));
        System.out.println("Индексы дублирующих элементов ");

        for(int i=0; i<mas.length; i++) {
            for (int j=i+1; j<mas.length; j++) {
                if(mas[i] == mas[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}