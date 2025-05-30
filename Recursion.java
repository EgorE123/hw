import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt(); //число до которого будет последовательность Фибоначчи
        int firstNumber = 0;
        int count = 0;
        while (true) {
            int fibonachi = Fibonachi(firstNumber);
            if (fibonachi > number) {
                System.out.print(" Число элементов ряда " + count);
                break;
            }
            count++;
            System.out.print(fibonachi + " ");
            firstNumber++;
        }
    }

    public static int Fibonachi(int number) {
        if (number <= 1) {
            return number;
        }
        return
                Fibonachi(number - 1) + Fibonachi(number - 2);
    }
}





