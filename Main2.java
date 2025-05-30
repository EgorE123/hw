import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Violin violin = new Violin("Скрипка", "Скрипка раритет 1800г");
        violin.sound();
        violin.desc();
        violin.show();
        System.out.println("---------------------------------------");

        ArrayIMath numbers = new ArrayIMath(new int[]{10, 2, 2, 3});
        System.out.println(numbers.Max());
        System.out.println(numbers.Min());
        System.out.println(numbers.Avg());

        System.out.println("----------------------------------------");
        SearchAvg searchAvg = new SearchAvg();
        Integer[] array = {10, 20, 30, 40, 50};
        Double avgArray = searchAvg.avgArray(array);
        System.out.println(avgArray);
    }
}
