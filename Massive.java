import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] massive = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            massive[i] = num;
        }
        for (int i = 0; i < count; i++) {
            sum += massive[i];
        }

        System.out.println(sum);
        System.out.println(sum / count);
        System.out.println(Arrays.toString(massive));
    }
}
