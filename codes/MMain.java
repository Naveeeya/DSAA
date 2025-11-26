class Solution {
    public void printNumbers(int n) {
        int i = 0;
        if(i>n) {
            return;
        }
        System.out.println(i);
        i++;
        printNumbers(i +1);


    }
}

public class MMain {
    public static void main(String[] args) {
        int n = 5;
        Solution sol = new Solution();
        sol.printNumbers(n);
    }
}

