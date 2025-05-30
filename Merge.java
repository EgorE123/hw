// todo Задача 2: Слияние массивов
//Напишите обобщенный метод для слияния двух массивов одного типа в один.

import java.util.Arrays;

public class Merge {
    public <T> void mergeArray(T[] arrayOne, T[] arrayTwo) {

        int one = arrayOne.length;
        int two = arrayTwo.length;
        int result = one + two;

        //int[] mergeArray = new int[result];
        Object[] mergeArray = new Object[result];

        System.arraycopy(arrayOne, 0, mergeArray, 0, arrayOne.length);
        System.arraycopy(arrayTwo, 0, mergeArray, arrayOne.length, arrayTwo.length);
        System.out.print("[");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i]);
            System.out.print(", ");
        }
        System.out.println("]");
    }

}



