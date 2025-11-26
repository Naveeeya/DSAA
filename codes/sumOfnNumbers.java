public class sumOfnNumbers {
    public static int function(int n) {
        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = function(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);
    }
}



