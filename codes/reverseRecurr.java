public class reverseRecurr {
    public static void reverseRecurssion(int i, int[] arr) {
        if(i<0){
            return;
        }
        System.out.print(arr[i]);
        reverseRecurssion(i-1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        reverseRecurssion(n-1, arr);
    }

}
