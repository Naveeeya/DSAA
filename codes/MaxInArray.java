import java.util.Scanner;

public class MaxInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of array elementsL: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("enter array elements: ");
        for(int i = 0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }

        int max = function(arr, n); //function is returning a value, let us name that value 'max'

        System.out.print("the maximum element is: "+ max);

    }

    public static int function(int arr[], int n){
        int result = 0;
        for(int i=1; i<=n-1; i++){
            if(arr[i] > arr[result]){
                result = i;
            }
        }
        return arr[result];
    }
}
