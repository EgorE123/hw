import java.lang.reflect.Array;

public class MainEqual {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 2, 3, 4, 5};
        Integer[] arrayTwo = {1, 2, 3, 4, 5};
        System.out.println(EqualArrays.ArraysEqual(arrayOne, arrayTwo));
        System.out.println("-------------------------------------------");
        System.out.println("Слияние массивов");


        Merge merge = new Merge();
        merge.mergeArray(arrayOne, arrayTwo);


        System.out.println("-------------------------------------------");



        Integer[] arrayThree = {};
        int index = ElementSearch.findIndex(arrayThree, 20); //нет таого элемента -1
        int index1 = ElementSearch.findIndex(arrayThree, 6);
        System.out.println("Индекс элемента: " + index);
        System.out.println("Индекс элемента: " + index1);

    }
}
