public class oneToN {
    public static void printNumber(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printNumber(i+1,n );
    }

    public static void main(String[] args) {
        int n= 5;
        int i=1;
        printNumber(i, n);

    }
}
