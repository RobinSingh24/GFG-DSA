package Recursion;

public class OneToN {
    public static void oneToN(int n){
        if(n==0)
            return;
        else{
            oneToN(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        oneToN(5);
    }
}
