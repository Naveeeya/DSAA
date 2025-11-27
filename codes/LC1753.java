public class LC1753 {
    public static void main(String[] args) {
        int nums[] = {2,1,3,4};

       check(nums);

    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n= nums.length;
        boolean answer = false;

        for(int i=0; i<=n-1; i++){
            if(nums[i] < nums[(i+1) % n]){
                count+=1;
                answer = true;
            }
            else{
                answer= false;
            }
        }

        System.out.println("answer: " + answer);
        return count<=1;

    }
}
