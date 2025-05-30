public class ArrayIMath implements IMath {

    int[] numbers;

    public ArrayIMath(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int Max() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        } return max;
    }
    @Override
    public int Min() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (float) sum / numbers.length;
    }
}
