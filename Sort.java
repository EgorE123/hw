import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] mass = {10, 30, 3, 40, 35, 16};
        bubbleSort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

    }

    public static void bubbleSort(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[j + 1] < mass[j]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
    }

}