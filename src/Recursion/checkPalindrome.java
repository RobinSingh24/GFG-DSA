package Recursion;

public class checkPalindrome {
    // intially start =0 ; end = s.length()-1
    public static boolean checkPalindrome(String s,int start, int end){
        if(start>=end)
            return true;
        return (s.charAt(start) == s.charAt(end) &&
            checkPalindrome(s,start+1,end-1));
    }
    public static void main(String[] args) {
        String s = "abbac";
        System.out.print(checkPalindrome(s,0, s.length()-1));
    }
}
