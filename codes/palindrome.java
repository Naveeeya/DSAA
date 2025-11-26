public class palindrome {
    public static boolean function(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();
        if(n<=1){
            return true;
        }
        if(s.charAt(0) != s.charAt(n-1)){
            return false;
        }

        return function(s.substring(1,n-1));

    }

    public static void main(String[] args) {
        String s = "naman";
        function(s);
    }
}
