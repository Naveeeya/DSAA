public class Factorial{
    public static void factorial(int i, int factorial) {

        if (i < 1) {
            System.out.print(factorial);
            return;
        }
        factorial(i - 1, factorial * i);

    }

    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        factorial(n, factorial);
    }
}
