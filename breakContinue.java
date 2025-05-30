import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = numberOne; i <= numberTwo; i++) {
            sum += i;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum / count);
    }
}
