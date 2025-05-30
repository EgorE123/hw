public class OperTask3 {
    public static void main(String[] args) {
        int n = 210;
        int divisorOne = 2;
        int divisorTwo = 5;
        int divisorThree = 3;
        int divisorFour = 7;
        if (n % divisorOne == 0 && n % divisorTwo == 0 || n % divisorThree == 0 && n % divisorFour == 0) {
            System.out.println("Число делится нацело");
        } else {
            System.out.println("Число нацело не делится");
        }
    }
}
