package Mathematics;

public class TrailingZeroesInFactorial {
    public static int countTrailingZeroes(int n){
        int count =0;
        for(int i=5;i<=n;i*=5)
        {
            count = count + n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeroes(100));
    }
}
