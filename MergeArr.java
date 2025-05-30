//TODO Есть 2 массива в отсортированнов виде
//   int[] arr = {-5,0,1,1,2,3,6,8,22,45,678}
//   int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100}
//   int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
//   Нельзя использовать сортировку
import java.util.Arrays;
public class MergeArr {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

        int[] merged = mergeArrays(arr, arr2);
        System.out.println(Arrays.toString(merged));

    }
    public static int[] mergeArrays(int[] arr, int[] arr2) {
        int[] result = new int[arr.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr.length) {
            result[k++] = arr[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}

