package Mathematics;

public class DivisorsOfANumber {
    public static void naiveDivisors(int n){
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
    public static void optimisedDivisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0)
            {
                System.out.println(i);
                if(i!=n/i) System.out.println(n/i);
            }
        }
    }
    public static void efficientDivisors(int n){
        // iterate from [1,sqrt(n))
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
        // iterate from [sqrt(n),1]
        for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        efficientDivisors(30);
    }
}
