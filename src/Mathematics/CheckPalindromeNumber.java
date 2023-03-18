package Mathematics;


public class CheckPalindromeNumber {

    public static boolean checkPalindrome(int n){
        Integer numCopy = n;
        Integer rev=0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev);
        return rev.equals(numCopy);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(242));
    }
}
