public class sumOfN {
    public static void printSum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        printSum(i-1, sum +i);

    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        printSum(n, sum);
    }
}
