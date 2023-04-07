package Recursion;

public class sumOfFirstN {

    public static int sumOfNaturalNos(int n){
        if(n==0)
            return 0;
        else {
            return n+sumOfNaturalNos(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(sumOfNaturalNos(5));
    }
}
