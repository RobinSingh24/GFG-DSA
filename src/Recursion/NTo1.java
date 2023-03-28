package Recursion;

public class NTo1 {
    public static void printNTo1(int n){
        if(n==0)
            return;
        else
            System.out.println(n);
        printNTo1(n-1);

    }
    public static void main(String[] args) {
        printNTo1(5);
    }
}
