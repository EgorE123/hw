public class DebugFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {
        if (n == 0 || n == 1) {  //ошибка if (n == 2)
            return 1;

        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
