import java.util.Scanner;
import java.util.*;

public class SecondMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of total elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements:" );
        for(int i=0; i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

       function(arr, n); //function is returning a value, let us name that value 'max'



    }

    public static void function(int arr[], int n){

        int small= Integer.MAX_VALUE;
        int second_small= Integer.MAX_VALUE;

        int large= Integer.MIN_VALUE;
        int second_large= Integer.MIN_VALUE;

        for(int i=0; i<=n-1; i++){
            small= Math.min(small, arr[i]); //min: a method - It requires two inputs (arguments); It returns the smaller of the two.
            large= Math.max(large,arr[i]); //similar to min
        }

        for(int j=0; j<=n-1; j++){
            if(arr[j] < second_small && arr[j] != small){
                second_small = arr[j];
            }
            if(arr[j] > second_large && arr[j] != large){
                second_large= arr[j];
            }
        }

        System.out.print("second large element: "+ second_large);
        System.out.println();
        System.out.print("second small element: "+ second_small);
    }
}
