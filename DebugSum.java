public class DebugSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i <= numbers.length -1 ; i++) {  // ошибка была i <= number.length
            sum += numbers[i];
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
