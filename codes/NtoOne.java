public class NtoOne {
    public static void printNumber(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        printNumber(i-1,n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(n, n);

    }

}
